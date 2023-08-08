package com.example.taskmanager.presentstion.extensions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter

fun String.convertToColor(): Color {
    return Color(android.graphics.Color.parseColor(this))
}

fun String.convertColorGreen(): Color {
    return Color( android.graphics.Color.parseColor(this))
}