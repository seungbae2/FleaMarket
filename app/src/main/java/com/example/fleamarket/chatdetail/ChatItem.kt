package com.example.fleamarket.chatdetail

data class ChatItem(
    val senderId: String,
    val message: String
) {
    constructor(): this("","")
}
