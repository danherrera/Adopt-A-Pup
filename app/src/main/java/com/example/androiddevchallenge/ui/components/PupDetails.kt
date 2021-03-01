package com.example.androiddevchallenge.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Pup
import com.example.androiddevchallenge.ui.toText
import dev.chrisbanes.accompanist.coil.CoilImage

@ExperimentalAnimationApi
@Composable
fun PupDetails(
    pup: Pup,
    navController: NavController,
) {
    var requestedAdoption by remember { mutableStateOf(false) }
    CoilImage(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        data = pup.imageUrl,
        contentDescription = pup.name,
        contentScale = ContentScale.Crop,
    )
    Text(
        modifier = Modifier
            .padding(16.dp)
            .clickable { navController.navigateUp() },
        text = "✕",
        style = MaterialTheme.typography.h6,
        color = Color.LightGray,
    )
    Row(
        modifier = Modifier.fillMaxHeight(),
        verticalAlignment = Alignment.Bottom,
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = pup.name,
                    style = MaterialTheme.typography.h1,
                )
                Text(
                    text = stringResource(
                        id = R.string.pup_age,
                        pup.age
                    ) + " • " + pup.gender.toText(),
                    style = MaterialTheme.typography.body2
                )
                Spacer(Modifier.height(16.dp))
                Text(text = pup.description, style = MaterialTheme.typography.body1)
                Spacer(Modifier.height(16.dp))


                AnimatedVisibility(visible = requestedAdoption) {
                    Text(text = stringResource(id = R.string.adopt_acknowledge))
                }
                AnimatedVisibility(visible = !requestedAdoption) {
                    Button(onClick = { requestedAdoption = true }) {
                        Text(text = stringResource(id = R.string.adopt_request))
                    }
                }
            }
        }
    }
}