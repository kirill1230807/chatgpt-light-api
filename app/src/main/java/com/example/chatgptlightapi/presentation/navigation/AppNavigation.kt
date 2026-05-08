package com.example.chatgptlightapi.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.chatgptlightapi.presentation.screens.chat.MainChatScreen
import com.example.chatgptlightapi.presentation.screens.chat.MainChatScreenContent
import com.example.chatgptlightapi.presentation.screens.chat.MainChatViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentRoute = navBackStackEntry?.destination?.route

    val mainChatViewModel: MainChatViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = ChatRoute,
    ) {
        composable<OnBoardingRoute> {
            // TODO
        }

        composable<ChatRoute> {
            MainChatScreen(
                viewModel = mainChatViewModel
            )
        }

        composable<SettingsRoute> {
            // TODO
        }
    }
}