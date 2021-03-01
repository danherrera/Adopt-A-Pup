package com.example.androiddevchallenge.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Gender

fun Gender.toColor(): Color = when (this) {
    Gender.FEMALE -> Color.Magenta
    Gender.MALE -> Color.Blue
}

@Composable
fun Gender.toText(): String = stringResource(
    id = when (this) {
        Gender.FEMALE -> R.string.gender_female
        Gender.MALE -> R.string.gender_male
    }
)