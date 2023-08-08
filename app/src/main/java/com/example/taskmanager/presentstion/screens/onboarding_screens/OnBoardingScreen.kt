package com.example.taskmanager.presentstion.screens.onboarding_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.R
import com.example.taskmanager.ui.theme.TaskManagerTheme

@Preview
@Composable
fun OnBoardingScreenPreview() {
    TaskManagerTheme {
        OnBoardingScreen()
    }
}

@Composable
fun OnBoardingScreen(
    modifier: Modifier = Modifier
) {
    val isClick = remember {
        mutableStateOf(false)
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(colorResource(id = R.color.purple))
    ) {
        Image(
            modifier = modifier
                .fillMaxWidth(),
            painter = painterResource(
                id = R.drawable.image
            ),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = modifier
                .fillMaxWidth()
                .height(480.dp)
                .align(Alignment.BottomCenter)
                .clip(
                    RoundedCornerShape(
                        topEnd = 15.dp,
                        topStart = 15.dp,
                        bottomEnd = 0.dp,
                        bottomStart = 0.dp,
                    )
                )
                .background(colorResource(id = R.color.white))
        ) {
            Text(
                modifier = modifier
                    .padding(horizontal = 40.dp)
                    .padding(top = 122.dp),
                text = stringResource(id = R.string.building_better),
                color = Color.Black,
                fontSize = 37.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                lineHeight = 46.sp
            )
            Text(
                modifier = modifier
                    .padding(horizontal = 40.dp)
                    .padding(top = 10.dp),
                text = stringResource(id = R.string.create_a_unique),
                color = colorResource(id = R.color.grey),
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
            Button(
                modifier = modifier
                    .padding(horizontal = 40.dp)
                    .padding(top = 36.dp)
                    .fillMaxWidth()
                    .height(60.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.purple)
                )
            ) {
                Text(
                    text = stringResource(id = R.string.get_started),
                )
            }
        }
    }
}

