package com.groupec.diaspoa.presentation.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.unit.dp
import com.groupec.diaspoa.presentation.ui.components.StatisticCard
import com.groupec.sampleapp.ui.home.HomeViewModel
import diaspoa.composeapp.generated.resources.Res
import diaspoa.composeapp.generated.resources.stat_title_projects
import diaspoa.composeapp.generated.resources.stat_title_shopping
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = koinViewModel(),
    navigateToOneTimeShoppingDetails: () -> Unit,
    navigateToProjectTrackingDetails: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val cardModifier = Modifier.weight(1f).fillMaxHeight()
        // Statistics cards
        Row(
            modifier = Modifier.fillMaxWidth().height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            StatisticCard(
                modifier = cardModifier,
                title = stringResource(Res.string.stat_title_shopping),
                value = "12",
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                onclick = {}
            )
            StatisticCard(
                modifier = cardModifier,
                title = stringResource(Res.string.stat_title_projects),
                value = "3",
                containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                onclick = {}
            )
        }

        Spacer(Modifier.height(32.dp))

        // Avalaible services


    }
}