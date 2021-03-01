package com.example.androiddevchallenge

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.model.Pup
import com.example.androiddevchallenge.ui.components.PupListItem

@Composable
fun PupList(
    navController: NavController,
    pups: List<Pup>,
    modifier: Modifier = Modifier,
) {
    Box(modifier) {
        LazyColumn(Modifier.fillMaxWidth()) {
            items(pups) { pup ->
                PupListItem(pup, Modifier.fillMaxWidth()) {
                    navController.navigate("details/${it}")
                }
            }
        }
    }
}