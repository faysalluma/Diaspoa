package com.groupec.sampleapp.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
fun HomeScreen(
    navigateToDetails: () -> Unit,
    viewModel: HomeViewModel = koinViewModel()
) {
    val state by remember { viewModel.state }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = navigateToDetails) {
            Text("Go to Details")
        }

        if (state.isLoading) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Text("Loading...", style = MaterialTheme.typography.bodyMedium)
            }
        } else {
            LazyColumn {
                items(state.launches) { launch ->
                    Column(modifier = Modifier.padding(all = 16.dp)) {
                        Text(
                            text = "${launch.missionName} - ${launch.launchYear}",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            text = if (launch.launchSuccess == true) "Successful" else "Unsuccessful",
                            color = if (launch.launchSuccess == true) Color.Green else Color.Red
                        )
                        Spacer(Modifier.height(8.dp))
                        val details = launch.details
                        if (details?.isNotBlank() == true) {
                            Text(
                                text = details
                            )
                        }
                    }
                    HorizontalDivider()
                }
            }
        }

    }
}