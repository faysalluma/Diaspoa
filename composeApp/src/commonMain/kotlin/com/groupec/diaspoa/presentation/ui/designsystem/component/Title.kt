package com.groupec.diaspoa.presentation.ui.designsystem.component


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TitleLarge(
    title: String,
    color: Color = Color.Unspecified,
    modifier: Modifier = Modifier,
    textAlign: TextAlign ?= null
) {
    Text(
        text = title,
        modifier = modifier,
        textAlign = textAlign,
        color = color,
        style = MaterialTheme.typography.titleLarge
    )
}

@Composable
fun TitleMedium(title: String, color: Color = Color.Unspecified, modifier: Modifier = Modifier) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleMedium,
        color = color,
        modifier = modifier
    )
}

@Composable
fun TitleSmall(title: String, color: Color = Color.Unspecified, modifier: Modifier = Modifier) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleSmall,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        color = color,
        modifier = modifier
    )
}

@Preview
@Composable
fun TitleHeaderPreview() {
    Column {
        TitleLarge(title = "Première connexion")
        TitleMedium(title = "Première connexion")
        TitleSmall(title = "Première connexion")
    }
}