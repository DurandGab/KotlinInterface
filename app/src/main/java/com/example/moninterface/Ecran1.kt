package com.example.moninterface

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage

@Composable
fun EcranDestination1(backStack: MutableList<Any>) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AsyncImage(
            model = "https://isis.univ-jfc.fr/sites/isis.univ-jfc.fr/files/images-contenu/2024-09/Affiche_Forum.png",
            contentDescription = "Event Image"
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Où : Ecole ingénieur ISIS")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Quand : 24 octobre")
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { backStack.add(Destination2) }) {
                Text("Inscription")
            }
            OutlinedButton(onClick = { backStack.add(Destination3) }) {
                Text("Pas intéressé")
            }
        }
    }
}
