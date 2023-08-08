package com.example.taskmanager.presentstion.screens.onboarding_screens

import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination(start = true)
@Composable
fun OnBoarding(
    navigator: DestinationsNavigator
) {
    OnBoardingScreen()

}