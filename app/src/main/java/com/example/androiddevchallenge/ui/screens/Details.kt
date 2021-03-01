package com.example.androiddevchallenge.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.androiddevchallenge.data.PupRepository
import com.example.androiddevchallenge.ui.components.PupDetails

@Composable
fun Details(repo: PupRepository, pupId: Long?, navController: NavController) {
    pupId?.let(repo::findById)?.let {
        PupDetails(it, navController = navController)
    }
}