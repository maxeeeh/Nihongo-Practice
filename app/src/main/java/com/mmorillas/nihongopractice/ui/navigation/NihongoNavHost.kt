package com.mmorillas.nihongopractice.ui.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mmorillas.nihongopractice.ui.screens.hiragana.HiraganaScreen
import com.mmorillas.nihongopractice.ui.shared.model.ScaffoldConfiguration

@Composable
fun NihongoNavHost(
    navController: NavHostController,
    buildScaffoldConfiguration: (ScaffoldConfiguration) -> Unit,
    modifier: Modifier = Modifier
) {
    val slideIntoTransition: AnimatedContentTransitionScope<NavBackStackEntry>.() -> EnterTransition? =
        {
            if (initialState.destination.hierarchy.any {
                    topLevelRoutes.any { topLevelRoute ->
                        it.hasRoute(
                            topLevelRoute::class
                        )
                    }
                })
                slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.End, tween(700))
            else
                null
        }

    val slideOutOfTransition: AnimatedContentTransitionScope<NavBackStackEntry>.() -> ExitTransition? =
        {
            if (targetState.destination.hierarchy.any {
                    topLevelRoutes.any { topLevelRoute ->
                        it.hasRoute(
                            topLevelRoute::class
                        )
                    }
                })
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Start,
                    tween(700)
                )
            else
                null
        }


    NavHost(
        navController = navController,
        startDestination = HiraganaDestination,
        modifier = modifier.fillMaxSize()
    ) {
        composable<HiraganaDestination>(
            enterTransition = slideIntoTransition,
            exitTransition = slideOutOfTransition,
            popEnterTransition = slideIntoTransition,
            popExitTransition = slideOutOfTransition
        ) {
            HiraganaScreen(buildScaffoldConfiguration)
        }
    }
}