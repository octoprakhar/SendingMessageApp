package com.example.sendingmessageapp

//dto stands fro data transfer object
data class SendMessageDto(
    val to: String?,
    val notification : NotificationBody
)

data class NotificationBody(
    val title : String,
    val body : String
)
