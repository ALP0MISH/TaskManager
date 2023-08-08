package com.example.taskmanager.presentstion.screens.main_screens

import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = false)
@Composable
fun Main(
    navigator:DestinationsNavigator
) {
    MainScreen()
}