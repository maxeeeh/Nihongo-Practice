package com.mmorillas.nihongopractice.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Abc
import androidx.compose.ui.graphics.vector.ImageVector
import com.mmorillas.nihongopractice.R
import kotlinx.serialization.Serializable

interface NavigationDestination {
    val route: String

    val titleRes: Int

    val icon: ImageVector?
}

@Serializable
object HiraganaDestination : NavigationDestination {
    override val route: String = "hiragana"
    override val titleRes: Int = R.string.hiragana
    override val icon: ImageVector = Icons.Filled.Abc
}

@Serializable
object KatakanaDestination : NavigationDestination {
    override val route: String = "katakana"
    override val titleRes: Int = R.string.katakana
    override val icon: ImageVector = Icons.Filled.Abc
}

val topLevelRoutes = listOf(
    HiraganaDestination,
    KatakanaDestination
)