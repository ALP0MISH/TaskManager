package com.example.taskmanager.domain.repository

import com.example.taskmanager.domain.models.TaskACT

interface TaskRepository {

    fun fetchAllTacks(): List<TaskACT>

    fun fetchAllProgress(): List<Process>

    fun fetchAllProgressCategory(progressType:String): Process
}
