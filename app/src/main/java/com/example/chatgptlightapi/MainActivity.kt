package com.example.chatgptlightapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.chatgptlightapi.core.ui.theme.ChatGPTLightAPITheme
import com.example.chatgptlightapi.presentation.navigation.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChatGPTLightAPITheme {
                AppNavigation()
            }
        }
    }
}