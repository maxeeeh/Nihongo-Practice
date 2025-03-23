package com.mmorillas.nihongopractice.ui.theme
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.mmorillas.nihongopractice.ui.theme.backgroundDark
import com.mmorillas.nihongopractice.ui.theme.backgroundDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.backgroundDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.backgroundLight
import com.mmorillas.nihongopractice.ui.theme.backgroundLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.backgroundLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.errorContainerDark
import com.mmorillas.nihongopractice.ui.theme.errorContainerDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.errorContainerDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.errorContainerLight
import com.mmorillas.nihongopractice.ui.theme.errorContainerLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.errorContainerLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.errorDark
import com.mmorillas.nihongopractice.ui.theme.errorDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.errorDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.errorLight
import com.mmorillas.nihongopractice.ui.theme.errorLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.errorLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.inverseOnSurfaceDark
import com.mmorillas.nihongopractice.ui.theme.inverseOnSurfaceDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.inverseOnSurfaceDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.inverseOnSurfaceLight
import com.mmorillas.nihongopractice.ui.theme.inverseOnSurfaceLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.inverseOnSurfaceLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.inversePrimaryDark
import com.mmorillas.nihongopractice.ui.theme.inversePrimaryDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.inversePrimaryDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.inversePrimaryLight
import com.mmorillas.nihongopractice.ui.theme.inversePrimaryLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.inversePrimaryLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.inverseSurfaceDark
import com.mmorillas.nihongopractice.ui.theme.inverseSurfaceDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.inverseSurfaceDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.inverseSurfaceLight
import com.mmorillas.nihongopractice.ui.theme.inverseSurfaceLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.inverseSurfaceLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onBackgroundDark
import com.mmorillas.nihongopractice.ui.theme.onBackgroundDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.onBackgroundDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onBackgroundLight
import com.mmorillas.nihongopractice.ui.theme.onBackgroundLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.onBackgroundLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onErrorContainerDark
import com.mmorillas.nihongopractice.ui.theme.onErrorContainerDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.onErrorContainerDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onErrorContainerLight
import com.mmorillas.nihongopractice.ui.theme.onErrorContainerLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.onErrorContainerLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onErrorDark
import com.mmorillas.nihongopractice.ui.theme.onErrorDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.onErrorDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onErrorLight
import com.mmorillas.nihongopractice.ui.theme.onErrorLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.onErrorLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onPrimaryContainerDark
import com.mmorillas.nihongopractice.ui.theme.onPrimaryContainerDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.onPrimaryContainerDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onPrimaryContainerLight
import com.mmorillas.nihongopractice.ui.theme.onPrimaryContainerLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.onPrimaryContainerLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onPrimaryDark
import com.mmorillas.nihongopractice.ui.theme.onPrimaryDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.onPrimaryDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onPrimaryLight
import com.mmorillas.nihongopractice.ui.theme.onPrimaryLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.onPrimaryLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onSecondaryContainerDark
import com.mmorillas.nihongopractice.ui.theme.onSecondaryContainerDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.onSecondaryContainerDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onSecondaryContainerLight
import com.mmorillas.nihongopractice.ui.theme.onSecondaryContainerLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.onSecondaryContainerLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onSecondaryDark
import com.mmorillas.nihongopractice.ui.theme.onSecondaryDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.onSecondaryDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onSecondaryLight
import com.mmorillas.nihongopractice.ui.theme.onSecondaryLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.onSecondaryLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onSurfaceDark
import com.mmorillas.nihongopractice.ui.theme.onSurfaceDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.onSurfaceDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onSurfaceLight
import com.mmorillas.nihongopractice.ui.theme.onSurfaceLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.onSurfaceLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onSurfaceVariantDark
import com.mmorillas.nihongopractice.ui.theme.onSurfaceVariantDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.onSurfaceVariantDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onSurfaceVariantLight
import com.mmorillas.nihongopractice.ui.theme.onSurfaceVariantLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.onSurfaceVariantLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onTertiaryContainerDark
import com.mmorillas.nihongopractice.ui.theme.onTertiaryContainerDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.onTertiaryContainerDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onTertiaryContainerLight
import com.mmorillas.nihongopractice.ui.theme.onTertiaryContainerLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.onTertiaryContainerLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onTertiaryDark
import com.mmorillas.nihongopractice.ui.theme.onTertiaryDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.onTertiaryDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.onTertiaryLight
import com.mmorillas.nihongopractice.ui.theme.onTertiaryLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.onTertiaryLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.outlineDark
import com.mmorillas.nihongopractice.ui.theme.outlineDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.outlineDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.outlineLight
import com.mmorillas.nihongopractice.ui.theme.outlineLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.outlineLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.outlineVariantDark
import com.mmorillas.nihongopractice.ui.theme.outlineVariantDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.outlineVariantDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.outlineVariantLight
import com.mmorillas.nihongopractice.ui.theme.outlineVariantLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.outlineVariantLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.primaryContainerDark
import com.mmorillas.nihongopractice.ui.theme.primaryContainerDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.primaryContainerDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.primaryContainerLight
import com.mmorillas.nihongopractice.ui.theme.primaryContainerLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.primaryContainerLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.primaryDark
import com.mmorillas.nihongopractice.ui.theme.primaryDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.primaryDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.primaryLight
import com.mmorillas.nihongopractice.ui.theme.primaryLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.primaryLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.scrimDark
import com.mmorillas.nihongopractice.ui.theme.scrimDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.scrimDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.scrimLight
import com.mmorillas.nihongopractice.ui.theme.scrimLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.scrimLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.secondaryContainerDark
import com.mmorillas.nihongopractice.ui.theme.secondaryContainerDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.secondaryContainerDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.secondaryContainerLight
import com.mmorillas.nihongopractice.ui.theme.secondaryContainerLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.secondaryContainerLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.secondaryDark
import com.mmorillas.nihongopractice.ui.theme.secondaryDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.secondaryDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.secondaryLight
import com.mmorillas.nihongopractice.ui.theme.secondaryLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.secondaryLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceBrightDark
import com.mmorillas.nihongopractice.ui.theme.surfaceBrightDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceBrightDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceBrightLight
import com.mmorillas.nihongopractice.ui.theme.surfaceBrightLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceBrightLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerDark
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighDark
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighLight
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighestDark
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighestDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighestDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighestLight
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighestLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerHighestLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLight
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowDark
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowLight
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowestDark
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowestDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowestDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowestLight
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowestLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceContainerLowestLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceDark
import com.mmorillas.nihongopractice.ui.theme.surfaceDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceDimDark
import com.mmorillas.nihongopractice.ui.theme.surfaceDimDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceDimDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceDimLight
import com.mmorillas.nihongopractice.ui.theme.surfaceDimLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceDimLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceLight
import com.mmorillas.nihongopractice.ui.theme.surfaceLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceVariantDark
import com.mmorillas.nihongopractice.ui.theme.surfaceVariantDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceVariantDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceVariantLight
import com.mmorillas.nihongopractice.ui.theme.surfaceVariantLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.surfaceVariantLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.tertiaryContainerDark
import com.mmorillas.nihongopractice.ui.theme.tertiaryContainerDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.tertiaryContainerDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.tertiaryContainerLight
import com.mmorillas.nihongopractice.ui.theme.tertiaryContainerLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.tertiaryContainerLightMediumContrast
import com.mmorillas.nihongopractice.ui.theme.tertiaryDark
import com.mmorillas.nihongopractice.ui.theme.tertiaryDarkHighContrast
import com.mmorillas.nihongopractice.ui.theme.tertiaryDarkMediumContrast
import com.mmorillas.nihongopractice.ui.theme.tertiaryLight
import com.mmorillas.nihongopractice.ui.theme.tertiaryLightHighContrast
import com.mmorillas.nihongopractice.ui.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
  val colorScheme = when {
      dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
          val context = LocalContext.current
          if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
      }
      
      darkTheme -> darkScheme
      else -> lightScheme
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = AppTypography,
    content = content
  )
}

