package com.groupec.diaspoa.presentation.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.groupec.salesb.core.designsystem.icon.AppIcons
import diaspoa.composeapp.generated.resources.Res
import diaspoa.composeapp.generated.resources.hello
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview


sealed class MenuItem {
    data class Action(val label: String, val onClick: () -> Unit) : MenuItem()
    data class SubMenu(val label: String, val children: List<Action>) : MenuItem()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleTopAppBar(
    titleBar: String,
    onNavigationClick: (() -> Unit)? = null,
    onActionClick: (() -> Unit)? = null
) {
    var expanded by remember { mutableStateOf(false) }
    var subMenuExpandedIndex by remember { mutableStateOf<Int?>(null) }

    TopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface,
            navigationIconContentColor =  MaterialTheme.colorScheme.primary,
            actionIconContentColor = MaterialTheme.colorScheme.primary
        ),
        title = {
            Column(
                modifier = Modifier.padding(top = 12.dp)
            ) {
                Text(
                    text = stringResource(Res.string.hello, titleBar),
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "France",
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Light
                    )
                )
            }

        },
        navigationIcon = {
            onNavigationClick?.let {
                IconButton(onClick = it) {
                    Icon(AppIcons.ArrowBack, contentDescription = "Back")
                }
            }
        },
        actions = {
            onActionClick?.let {
                IconButton(onClick = it) {
                    Icon(AppIcons.Notification, contentDescription = "Back")
                }
            }
        }
    )
}


@Preview
@Composable
private fun TopAppBarPreview() {
    SampleTopAppBar(
        titleBar = "My top bar",
        onNavigationClick = {},
        onActionClick = {}
    )
}
