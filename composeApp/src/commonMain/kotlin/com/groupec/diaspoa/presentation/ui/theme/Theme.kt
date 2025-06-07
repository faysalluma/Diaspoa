package com.groupec.diaspoa
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.groupec.diaspoa.presentation.ui.theme.backgroundDark
import com.groupec.diaspoa.presentation.ui.theme.backgroundLight
import com.groupec.diaspoa.presentation.ui.theme.errorContainerDark
import com.groupec.diaspoa.presentation.ui.theme.errorContainerLight
import com.groupec.diaspoa.presentation.ui.theme.errorDark
import com.groupec.diaspoa.presentation.ui.theme.errorLight
import com.groupec.diaspoa.presentation.ui.theme.inverseOnSurfaceDark
import com.groupec.diaspoa.presentation.ui.theme.inverseOnSurfaceLight
import com.groupec.diaspoa.presentation.ui.theme.inversePrimaryDark
import com.groupec.diaspoa.presentation.ui.theme.inversePrimaryLight
import com.groupec.diaspoa.presentation.ui.theme.inverseSurfaceDark
import com.groupec.diaspoa.presentation.ui.theme.inverseSurfaceLight
import com.groupec.diaspoa.presentation.ui.theme.onBackgroundDark
import com.groupec.diaspoa.presentation.ui.theme.onBackgroundLight
import com.groupec.diaspoa.presentation.ui.theme.onErrorContainerDark
import com.groupec.diaspoa.presentation.ui.theme.onErrorContainerLight
import com.groupec.diaspoa.presentation.ui.theme.onErrorDark
import com.groupec.diaspoa.presentation.ui.theme.onErrorLight
import com.groupec.diaspoa.presentation.ui.theme.onPrimaryContainerDark
import com.groupec.diaspoa.presentation.ui.theme.onPrimaryContainerLight
import com.groupec.diaspoa.presentation.ui.theme.onPrimaryDark
import com.groupec.diaspoa.presentation.ui.theme.onPrimaryLight
import com.groupec.diaspoa.presentation.ui.theme.onSecondaryContainerDark
import com.groupec.diaspoa.presentation.ui.theme.onSecondaryContainerLight
import com.groupec.diaspoa.presentation.ui.theme.onSecondaryDark
import com.groupec.diaspoa.presentation.ui.theme.onSecondaryLight
import com.groupec.diaspoa.presentation.ui.theme.onSurfaceDark
import com.groupec.diaspoa.presentation.ui.theme.onSurfaceLight
import com.groupec.diaspoa.presentation.ui.theme.onSurfaceVariantDark
import com.groupec.diaspoa.presentation.ui.theme.onSurfaceVariantLight
import com.groupec.diaspoa.presentation.ui.theme.onTertiaryContainerDark
import com.groupec.diaspoa.presentation.ui.theme.onTertiaryContainerLight
import com.groupec.diaspoa.presentation.ui.theme.onTertiaryDark
import com.groupec.diaspoa.presentation.ui.theme.onTertiaryLight
import com.groupec.diaspoa.presentation.ui.theme.outlineDark
import com.groupec.diaspoa.presentation.ui.theme.outlineLight
import com.groupec.diaspoa.presentation.ui.theme.outlineVariantDark
import com.groupec.diaspoa.presentation.ui.theme.outlineVariantLight
import com.groupec.diaspoa.presentation.ui.theme.primaryContainerDark
import com.groupec.diaspoa.presentation.ui.theme.primaryContainerLight
import com.groupec.diaspoa.presentation.ui.theme.primaryDark
import com.groupec.diaspoa.presentation.ui.theme.primaryLight
import com.groupec.diaspoa.presentation.ui.theme.scrimDark
import com.groupec.diaspoa.presentation.ui.theme.scrimLight
import com.groupec.diaspoa.presentation.ui.theme.secondaryContainerDark
import com.groupec.diaspoa.presentation.ui.theme.secondaryContainerLight
import com.groupec.diaspoa.presentation.ui.theme.secondaryDark
import com.groupec.diaspoa.presentation.ui.theme.secondaryLight
import com.groupec.diaspoa.presentation.ui.theme.surfaceBrightDark
import com.groupec.diaspoa.presentation.ui.theme.surfaceBrightLight
import com.groupec.diaspoa.presentation.ui.theme.surfaceContainerDark
import com.groupec.diaspoa.presentation.ui.theme.surfaceContainerHighDark
import com.groupec.diaspoa.presentation.ui.theme.surfaceContainerHighLight
import com.groupec.diaspoa.presentation.ui.theme.surfaceContainerHighestDark
import com.groupec.diaspoa.presentation.ui.theme.surfaceContainerHighestLight
import com.groupec.diaspoa.presentation.ui.theme.surfaceContainerLight
import com.groupec.diaspoa.presentation.ui.theme.surfaceContainerLowDark
import com.groupec.diaspoa.presentation.ui.theme.surfaceContainerLowLight
import com.groupec.diaspoa.presentation.ui.theme.surfaceContainerLowestDark
import com.groupec.diaspoa.presentation.ui.theme.surfaceContainerLowestLight
import com.groupec.diaspoa.presentation.ui.theme.surfaceDark
import com.groupec.diaspoa.presentation.ui.theme.surfaceDimDark
import com.groupec.diaspoa.presentation.ui.theme.surfaceDimLight
import com.groupec.diaspoa.presentation.ui.theme.surfaceLight
import com.groupec.diaspoa.presentation.ui.theme.surfaceVariantDark
import com.groupec.diaspoa.presentation.ui.theme.surfaceVariantLight
import com.groupec.diaspoa.presentation.ui.theme.tertiaryContainerDark
import com.groupec.diaspoa.presentation.ui.theme.tertiaryContainerLight
import com.groupec.diaspoa.presentation.ui.theme.tertiaryDark
import com.groupec.diaspoa.presentation.ui.theme.tertiaryLight

val lightScheme = lightColorScheme(
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

val darkScheme = darkColorScheme(
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


@Composable
expect fun AppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)
