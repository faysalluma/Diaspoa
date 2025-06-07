package com.groupec.diaspoa

import App
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.groupec.sampleapp.di.initializeKoin
import kotlinx.browser.document
import kotlinx.browser.window

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    initializeKoin()
    val isDarkTheme = window.matchMedia("(prefers-color-scheme: dark)").matches
    ComposeViewport(document.body!!) {
        App(
            darkTheme = isDarkTheme,
            dynamicColor = false
        )
    }
}
