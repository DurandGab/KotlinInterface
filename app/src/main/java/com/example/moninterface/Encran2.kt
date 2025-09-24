package com.example.moninterface

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun EcranDestination2(backStack: MutableList<Any>) {
    val viewModel = viewModel<MainViewModel>()
    val diceState by viewModel.diceState.collectAsStateWithLifecycle()
    val onRoll by viewModel.onRoll.collectAsStateWithLifecycle()
    var faceDee: Int= R.drawable.dice_1
    when(diceState){
        0-> faceDee= R.drawable.dice_1
        1-> faceDee= R.drawable.dice_2
        2-> faceDee= R.drawable.dice_3
        3-> faceDee= R.drawable.dice_4
        4-> faceDee= R.drawable.dice_5
        5-> faceDee= R.drawable.dice_6
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Générez votre numéro de passage")
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = faceDee),
                contentDescription = "Dice Image"
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { viewModel.roll() }) {
                Text("Roll")
            }
            Button(onClick = { backStack.removeLastOrNull() }) {
                Text("Retour")
            }
        }
    }
}