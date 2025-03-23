package com.mmorillas.nihongopractice.ui.shared.model

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable

data class ScaffoldConfiguration(
    val topAppBar: @Composable () -> Unit = {},
    val floatingActionButton: @Composable () -> Unit = {},
    val snackbarHostState: SnackbarHostState? = null
)