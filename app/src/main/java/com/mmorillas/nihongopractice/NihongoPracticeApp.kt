package com.mmorillas.nihongopractice

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.mmorillas.nihongopractice.ui.navigation.NihongoNavHost
import com.mmorillas.nihongopractice.ui.navigation.topLevelRoutes
import com.mmorillas.nihongopractice.ui.shared.model.ScaffoldConfiguration

@Composable
fun NihongoPracticeApp(navController: NavHostController = rememberNavController()) {
    var scaffoldConfiguration by remember { mutableStateOf(ScaffoldConfiguration()) }

    val buildScaffoldConfiguration: (ScaffoldConfiguration) -> Unit = {
        scaffoldConfiguration = it
    }

    Scaffold (
        topBar = scaffoldConfiguration.topAppBar,
        floatingActionButton = scaffoldConfiguration.floatingActionButton,
        snackbarHost = {
            if (scaffoldConfiguration.snackbarHostState != null) {
                SnackbarHost(hostState = scaffoldConfiguration.snackbarHostState!!)
            }
        },
        bottomBar = { BottomNavigationBar(navController) },
    ) { innerPadding ->
        NihongoNavHost(
            navController,
            buildScaffoldConfiguration,
            Modifier.padding(innerPadding)
        )
    }
}

@Composable
private fun BottomNavigationBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val showNavigationBar = currentDestination?.hierarchy?.any { topLevelRoutes.any{ topLevelRoute -> it.hasRoute(topLevelRoute::class)}  } ?: false

    if (showNavigationBar) {
        NavigationBar {
            topLevelRoutes.forEach { topLevelRoute ->
                NavigationBarItem(
                    selected = currentDestination?.hierarchy?.any { it.hasRoute(topLevelRoute::class) } ?: false,
                    onClick = {
                        navController.navigate(topLevelRoute) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                    label = { Text(stringResource(topLevelRoute.titleRes)) },
                    icon = {
                        Icon(
                            imageVector = topLevelRoute.icon!!,
                            contentDescription = stringResource(topLevelRoute.titleRes)
                        )
                    }
                )
            }
        }
    }
}