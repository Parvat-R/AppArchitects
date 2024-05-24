package com.example.aavinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.aavinapp.ui.theme.AavinAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AavinAppTheme {
                var sessionDetails by remember {
                    mutableStateOf(SessionDetails("none", "none", "device"))
                }
                    LoginUI(sessionDetails = sessionDetails)
//                Text(text = "Hello")
            }
        }
    }
}
