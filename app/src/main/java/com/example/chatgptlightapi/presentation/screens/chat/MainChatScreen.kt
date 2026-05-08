package com.example.chatgptlightapi.presentation.screens.chat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chatgptlightapi.R

@Composable
fun MainChatScreen() {

}
@Composable
fun MainChatScreenContent(
) {
    var message by remember { mutableStateOf("") }

    Scaffold(
        bottomBar = {
            MessageInputField(
                text = message,
                onTextChange = { message = it },
                onSendClick = {
                    println("Кнопка натиснута")
                    message = ""
                }
            )
        },
        modifier = Modifier
            .imePadding()
            .background(color = Color.Gray)
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            items(20) {
                Text(
                    text = "Повідомлення $it",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

@Composable
private fun MessageInputField(
    text: String,
    onSendClick: () -> Unit,
    onTextChange: (String) -> Unit
) {
    Surface(
        tonalElevation = 3.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .navigationBarsPadding(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = text,
                onValueChange = onTextChange,
                modifier = Modifier.weight(1f),
                placeholder = { Text("Напишіть повідомлення...") }
            )

            Spacer(modifier = Modifier.width(8.dp))

            IconButton(
                onClick = onSendClick
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_arrow_upward_24),
                    contentDescription = "Send"
                )
            }
        }
    }
}

@Preview
@Composable
private fun MainChatScreenContentRoute() {
    MainChatScreenContent()
}