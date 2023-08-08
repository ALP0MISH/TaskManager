package com.example.taskmanager.domain.models

import java.util.UUID

data class User(
    val id: String,
    val firstName: String,
    val lastName: String,
    val imageId: String,
) {

    companion object {
        val preview = User(
            id = UUID.randomUUID().toString(),
            firstName = "Groot",
            lastName = "",
            imageId = "https://distribution.faceit-cdn.net/images/8e6c0835-3dc5-4ce2-8421-4e07854fd71d.jpeg",
        )
        val previews = listOf(
            preview.copy(
                imageId = "https://distribution.faceit-cdn.net/images/8e6c0835-3dc5-4ce2-8421-4e07854fd71d.jpeg"
            ),
            preview.copy(
                imageId = "https://stihi.ru/pics/2017/09/15/2392.jpg"
            ),
        )
    }
}