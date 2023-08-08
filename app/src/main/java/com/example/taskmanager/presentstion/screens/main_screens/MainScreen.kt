package com.example.taskmanager.presentstion.screens.main_screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.R
import com.example.taskmanager.domain.models.TaskACT
import com.example.taskmanager.domain.models.User
import com.example.taskmanager.presentstion.components.IncludeInformation
import com.example.taskmanager.presentstion.components.IncludeMainScreenContent
import com.example.taskmanager.presentstion.components.MainScreenHeader
import com.example.taskmanager.presentstion.extensions.SpacerHeight
import com.example.taskmanager.presentstion.extensions.SpacerWidth
import com.example.taskmanager.ui.theme.TaskManagerTheme

@Preview
@Composable
fun MainScreenPreview() {
    TaskManagerTheme {
        MainScreen()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Scaffold { innerPaddings ->
        LazyColumn(
            modifier = modifier
                .padding(innerPaddings)
                .fillMaxWidth()
        ) {
            item(

            ) {
                MainScreenHeader(user = User.preview)

            }

            item(

            ) {
                IncludeMainScreenContent(category = TaskACT.preview)
            }

            item(key = TaskACT.previews) {
                IncludeInformation(task = TaskACT.preview)
            }

            item {
                Column {
                    SpacerHeight(dp = 25.dp)
                    Text(
                        modifier = modifier.padding(start = 16.dp),
                        text = stringResource(id = R.string.monthly_preview),
                        style = MaterialTheme.typography.titleSmall,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            item(
            ) {
                Row {
                    Column {
                        SpacerHeight(dp = 25.dp)
                        ProgressInfo(
                            color = colorResource(id = R.color.green),
                            count = "22",
                            text = "Done",
                            height = 165.dp
                        )
                        ProgressInfo(
                            color = colorResource(id = R.color.red),
                            count = "12",
                            text = "Ongoing",
                            height = 115.dp
                        )
                    }
                    Column {
                        SpacerHeight(dp = 25.dp)

                        ProgressInfo(
                            color = colorResource(id = R.color.yellow),
                            count = "7",
                            text = "In Progress",
                            height = 115.dp
                        )
                        ProgressInfo(
                            height = 165.dp,
                            color = colorResource(id = R.color.light_blue),
                            count = "14",
                            text = "Waiting For Review",
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ProgressInfo(
    modifier: Modifier = Modifier,
    color: Color,
    count: String,
    text: String,
    height: Dp
) {
    Box(
        modifier = modifier
            .padding(top = 13.dp)
            .padding(start = 17.dp)
            .height(height)
            .width(180.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(color),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = modifier,
                text = count,
                style = MaterialTheme.typography.titleLarge,
                fontSize = 36.sp,
                color = Color.White,
            )
            Text(
                modifier = modifier,
                text = text,
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 14.sp,
                color = Color.White
            )
        }
    }
}

