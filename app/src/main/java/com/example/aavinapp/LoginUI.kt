package com.example.aavinapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginUI(sessionDetails: SessionDetails) {
    Scaffold (
        modifier = Modifier
    ){
        innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
            ) {
            Column (modifier = Modifier
                .padding(top = 200.dp)
                .padding(horizontal = 120.dp)){

                Text(text = "USER LOGIN", style = TextStyle(fontSize = 30.sp))
//                var farmerID by remember { mutableStateOf("")}
//                TextField(
//                    value = farmerID,
//                    onValueChange = { farmerID = it },
//                    label = { Text("Farmer ID") }
//                )
//                var password by remember { mutableStateOf("")}
//                TextField(
//                    value = farmerID,
//                    onValueChange = { password = it },
//                    label = { Text("password") }
//                )

            }
        }
    }

}
