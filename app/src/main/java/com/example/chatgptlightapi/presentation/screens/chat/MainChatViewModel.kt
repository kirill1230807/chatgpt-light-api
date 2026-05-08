package com.example.chatgptlightapi.presentation.screens.chat

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MainChatViewModel @Inject constructor() : ViewModel() {
    private val _messageText = MutableStateFlow("")
    val messageText : StateFlow<String> = _messageText.asStateFlow()

    fun onMessageTextChange(newText: String) {
        _messageText.value = newText
    }

    fun sendMessage() {
        val textToSend = _messageText.value
        if (textToSend.isNotBlank()) {
            println("The message sent: $textToSend")
            _messageText.value = ""
        }
    }
}