package com.example.chatgptlightapi.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.chatgptlightapi.presentation.screens.chat.MainChatScreen
import com.example.chatgptlightapi.presentation.screens.chat.MainChatScreenContent

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentRoute = navBackStackEntry?.destination?.route

    NavHost(
        navController = navController,
        startDestination = ChatRoute,
    ) {
        composable<OnBoardingRoute> {
            // TODO
        }

        composable<ChatRoute> {
            MainChatScreen()
        }

        composable<SettingsRoute> {
            // TODO
        }
    }
}