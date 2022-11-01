package com.example.delta.presentation

import androidx.compose.runtime.Composable
import com.example.delta.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.Modifier
import androidx.wear.compose.material.*

@Composable
fun ChipExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {
    Chip(
        modifier = modifier,
        onClick = { /* Log smoking to session */ },
        label = {
            Text(
                text = "I just smoked dummy",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        icon = {
            Icon(
                painter = painterResource(id = R.drawable.lungs),
                contentDescription = "triggers meditation action",
                modifier = iconModifier
            )
        },
    )
}