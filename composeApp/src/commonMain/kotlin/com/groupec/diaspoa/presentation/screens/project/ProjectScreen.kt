package com.groupec.diaspoa.presentation.screens.project

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
fun HistoryScreen() {
    val viewModel = koinViewModel<ProjectViewModel>()
    Text("Projects")
}