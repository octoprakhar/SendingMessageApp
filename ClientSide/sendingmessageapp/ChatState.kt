package com.example.sendingmessageapp

data class ChatState (
    val isEnteringToken : Boolean = true,
    val remoteToken : String = "",
    val messageText : String = ""
)