package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MaleLogo() {
    GenericShape { size, _ ->
        moveTo(size.width / 2f, size.height / 2f)
        lineTo(0f, 0f)
        arcTo(Rect(0f, 0f, 0f, 0f), 90f, 45f, false)
    }
}

@Preview
@Composable
fun MaleLogoPreview() {
    MaleLogo()
}