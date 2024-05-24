package com.example.aavinapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeUI(userSession: SessionDetails, navController: NavController){
    Scaffold (
        topBar = {
            TopAppBar(title = {
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Aavin", modifier = Modifier.padding(horizontal = 20.dp))
                    if (userSession.sessionID == "-") {
                        Box {
                            Button(onClick = {
                                LogoutUser(userSession)
                                navController.navigate("home")
                            }) {
                                Text("Logout")
                            }
                        }
                    }
                }
            })
        }
    ) {
        innerPadding ->
        Column (
            modifier = Modifier.padding(innerPadding)
        ) {
            Column (
                modifier = Modifier.padding(10.dp)
            ) {
                var displayName by remember {
                    mutableStateOf("Hello, ${userSession.farmerID}")
                }
                Text(displayName, modifier = Modifier.padding(vertical = 10.dp, horizontal = 15.dp), fontSize = 40.sp, fontWeight = FontWeight(500))

                Column(
                    modifier = Modifier
                        .background(Color(220, 200, 250, 250), shape = RoundedCornerShape(30))
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Your Transactions",
                        modifier = Modifier.padding(horizontal = 15.dp),
                        fontSize = 20.sp
                    )

                    Row {
                        if (userSession.sessionID != "") {
                            Text(text = "Login To Make Transactions!")
                        }
                    }
                }

            }
        }
    }
}


fun LogoutUser(userSession: SessionDetails) {
    ServerClient(userSession).requestRoute("/logout")
}
