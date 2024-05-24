package com.example.aavinapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginUI(sessionDetails: SessionDetails) {
//    Scaffold(
//        modifier = Modifier
//    ) { innerPadding ->
//        Column(
//            modifier = Modifier.padding(innerPadding),
//        ) {
//            Column(
//                modifier = Modifier
//                    .padding(top = 200.dp)
//                    .padding(horizontal = 120.dp)
//            ) {
//
//
//            }
//        }
//    }
    Column (modifier = Modifier
                    .padding(top = 200.dp)
                    .padding(horizontal = 120.dp)){
        Text(text = "USER LOGIN")
        var farmerID by remember { mutableStateOf("") }
        TextField(
            value = farmerID,
            onValueChange = { farmerID = it },
            label = { Text(text = "Farmer ID") }
        )
        var password by remember { mutableStateOf("") }
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "password") }
        )
        Button( onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Gray)){
            Text(
                text = "Sign in",
                style = TextStyle(fontSize = 14.sp)
            )
        }
    }
}



