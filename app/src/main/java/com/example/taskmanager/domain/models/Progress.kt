package com.example.taskmanager.domain.models

import java.util.UUID

data class Progress(
    val id: String,
    val progressType: String,
    val colorCode: String,
    val count: Int,
){
    companion object {
        val preview = Progress(
            id = UUID.randomUUID().toString(),
            progressType = "Done,in Progress,ongoing,waiting for review",
            count = 23,
            colorCode = "#A9FFEA"
        )
        val previews = listOf(
            preview.copy(
                colorCode = "#A9FFEA",
                count = 23,
            ),
            preview.copy(
                //  title = "",
              //  imageId = "https://stihi.ru/pics/2017/09/15/2392.jpg"
            ),
        )
    }
}





