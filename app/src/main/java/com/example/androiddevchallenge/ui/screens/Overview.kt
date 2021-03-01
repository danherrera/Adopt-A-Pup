package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.androiddevchallenge.PupList
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.PupRepository

@Composable
fun Overview(
    repo: PupRepository,
    navController: NavController,
) {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopAppBar(title = { Text(stringResource(id = R.string.app_name)) }) },
        content = {
            PupList(
                navController,
                repo.all(),
                Modifier.fillMaxWidth(),
            )
        },
    )
}