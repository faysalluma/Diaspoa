package com.groupec.diaspoa.presentation.screens.shopping

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
fun ShoppingScreen() {
    val viewModel = koinViewModel<ShoppingViewModel>()
    Text("Shopping")
}