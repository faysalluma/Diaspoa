package com.groupec.diaspoa.presentation.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.groupec.diaspoa.presentation.ui.designsystem.component.AppCard
import com.groupec.diaspoa.presentation.ui.designsystem.component.TitleLarge
import com.groupec.diaspoa.presentation.ui.designsystem.component.TitleSmall
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun StatisticCard(
    modifier: Modifier = Modifier,
    title: String,
    value: String,
    containerColor: Color,
    contentColor:  Color,
    onclick: () -> Unit
) {
    AppCard(
        modifier = modifier,
        containerColor = containerColor,
        contentColor = contentColor,
        headlineContent = {
            TitleSmall(title = title, modifier = Modifier.padding(bottom = 4.dp))
        },
        supportingContent = {
            TitleLarge(title = value)
        },
        onclick = onclick
    )
}

/*@Composable
fun ActionCard(
    modifier: Modifier = Modifier,
    title: String,
    details: String ? = null,
    containerColor: Color = MaterialTheme.colorScheme.surface,
    contentColor:  Color = MaterialTheme.colorScheme.onSurface,
    onclick: () -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        elevation = CardDefaults.cardElevation(8.dp), // Ombre de la carte
        shape = RoundedCornerShape(8.dp),  // Bords arrondis
        colors = CardDefaults.cardColors(
            containerColor = containerColor,
            contentColor = contentColor
        ),
        onClick = onclick
    ) {
        // Content of the card
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            TitleMedium(title)
            details?.let {
                TextMedium(it)
            }
        }
    }
}*/

@Preview
// @Preview(device = Devices.TABLET)
@Composable
fun ActionCardPreview() {

}