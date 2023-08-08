package com.example.taskmanager.data.fake_data

import com.example.taskmanager.domain.models.Progress
import com.example.taskmanager.domain.models.TaskACT
import com.example.taskmanager.domain.models.User
import java.util.UUID

class FakeData {
    companion object {

        fun fakeProgress() = listOf(
            Progress(
                id = UUID.randomUUID().toString(),
                progressType = "Done",
                count = 22,
                colorCode = "#6C60FF"
            ),
            Progress(
                id = UUID.randomUUID().toString(),
                progressType = "in Progress",
                count = 7,
                colorCode = "#6C60FF"

            ),
            Progress(
                id = UUID.randomUUID().toString(),
                progressType = "Ongoing",
                count = 12,
                colorCode = "#6C60FF"

            ),
            Progress(
                id = UUID.randomUUID().toString(),
                progressType = "Waiting for Review",
                count = 14,
                colorCode = "#6C60FF"

            )
        )

        fun fakeTaskAct() = listOf(
            TaskACT(
                id = UUID.randomUUID().toString(),
                title = "Information Architecture",
                data = "9.00AM-10.00AM",
                imageId = "#6C60FF",
                users = fakeUser(),
                colorCode = "#6C60FF"

            ),
            TaskACT(
                id = UUID.randomUUID().toString(),
                title = "Information Architecture",
                data = "9.00AM-10.00AM",
                imageId = "#6C60FF",
                users = fakeUser(),
                colorCode = "#6C60FF"

            ),
            TaskACT(
                id = UUID.randomUUID().toString(),
                title = "Software Testing",
                data = "11.00AM-12.00AM",
                imageId = "#6C60FF",
                colorCode = "#6C60FF",
                users = fakeUser()
            ),
            TaskACT(
                id = UUID.randomUUID().toString(),
                title = "Mobile App Design",
                data = "1.00AM-2.00AM",
                imageId = "#6C60FF",
                colorCode = "#6C60FF",
                users = fakeUser()
            )
        )

        fun fakeUser() = listOf(
            User(
                id = UUID.randomUUID().toString(),
                firstName = "Surf",
                lastName = "Surf",
                imageId = "https://distribution.faceit-cdn.net/images/8e6c0835-3dc5-4ce2-8421-4e07854fd71d.jpeg"
            ),
            User(
                id = UUID.randomUUID().toString(),
                firstName = "Groot",
                lastName = "Groot",
                imageId = "https://stihi.ru/pics/2017/09/15/2392.jpg"
            )
        )
    }
}