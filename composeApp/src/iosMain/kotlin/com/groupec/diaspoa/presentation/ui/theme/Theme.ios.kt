package com.groupec.diaspoa

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.ui.theme.AppTypography

@Composable
actual fun AppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if(darkTheme) darkScheme else lightScheme,
        typography = AppTypography,
        content = content
    )
}