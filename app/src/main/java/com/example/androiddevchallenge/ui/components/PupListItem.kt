package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Pup
import com.example.androiddevchallenge.ui.toColor
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PupListItem(
    pup: Pup,
    modifier: Modifier = Modifier,
    onClick: (Long) -> Unit,
) {
    val borderShape = RoundedCornerShape(16.dp)
    Row(
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
            .border(1.dp, color = pup.gender.toColor(), shape = borderShape)
            .clip(borderShape)
            .clickable {
                onClick(pup.id)
            },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        CoilImage(
            modifier = Modifier
                .width(96.dp)
                .height(96.dp),
            data = pup.imageUrl,
            contentDescription = pup.name,
            contentScale = ContentScale.Crop,
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(pup.name, style = MaterialTheme.typography.h6)
    }
}