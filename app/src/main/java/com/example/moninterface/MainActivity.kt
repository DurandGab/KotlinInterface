package com.example.moninterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.moninterface.ui.theme.MonInterfaceTheme



class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MonInterfaceTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text("Evenement") },
                            navigationIcon = { Icon(Icons.Filled.Menu, contentDescription = null) },
                            actions = { Icon(Icons.Filled.Favorite, contentDescription = null) }
                        )
                    },
                    modifier = Modifier.fillMaxSize()

                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(R.drawable.affiche_forum),
                                contentDescription = "Logo ISIS",
                                modifier = Modifier.padding(8.dp)
                            )
                            Text(
                                modifier = Modifier.padding(8.dp),
                                text = "Où : Ecole ingénieur ISIS"
                            )
                            Text(
                                modifier = Modifier.padding(8.dp),
                                text = "Quand : 24 octobre"
                            )
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(8.dp)
                            ) {
                                Button(
                                    onClick = { /*TODO*/ },
                                    modifier = Modifier.padding(8.dp)
                                ) {
                                    Text("Je participe !")
                                }
                                Button(
                                    onClick = { /*TODO*/ },
                                    modifier = Modifier.padding(8.dp),
                                    colors = androidx.compose.material3.ButtonDefaults.outlinedButtonColors(),
                                    border = androidx.compose.material3.ButtonDefaults.outlinedButtonBorder
                                ) {
                                    Text("Pas intéressé")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MonInterfaceTheme(
        content = {
            Text(text = "Hello Android!")
        }
    )
}

