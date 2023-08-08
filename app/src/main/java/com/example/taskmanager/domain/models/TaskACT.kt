package com.example.taskmanager.domain.models

import com.example.taskmanager.domain.models.User
import java.util.UUID

data class TaskACT(
    val id: String,
    val title: String,
    val data: String,
    val colorCode: String,
    val imageId: String,
    val users: List<User>
){
    companion object {
        val preview = TaskACT(
            id = UUID.randomUUID().toString(),
            title = "Groot",
            users = User.previews,
            imageId = "https://distribution.faceit-cdn.net/images/8e6c0835-3dc5-4ce2-8421-4e07854fd71d.jpeg",
            data = "22.10.23",
            colorCode = "#6C60FF"
        )
        val previews = listOf(
            preview.copy(
              //  title = "Groot",
                imageId = "https://distribution.faceit-cdn.net/images/8e6c0835-3dc5-4ce2-8421-4e07854fd71d.jpeg"
            ),
            preview.copy(
              //  title = "",
                imageId = "https://stihi.ru/pics/2017/09/15/2392.jpg"
            ),
        )
    }
}
