package com.example.taskmanager.presentstion.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.taskmanager.R
import com.example.taskmanager.domain.models.TaskACT
import com.example.taskmanager.presentstion.extensions.SpacerWidth
import com.example.taskmanager.presentstion.extensions.convertToColor
import com.example.taskmanager.ui.theme.TaskManagerTheme

@Preview
@Composable
fun IncludeLazyRowPreview() {
    TaskManagerTheme {
        IncludeInformation(
            task = TaskACT.preview
        )
    }
}

@Composable
fun IncludeInformation(
    modifier: Modifier = Modifier,
    task: TaskACT
) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(task.colorCode.convertToColor())
                .padding(horizontal = 15.dp)
        ) {
            Text(
                modifier = modifier
                    .padding(top = 14.dp),
                text = stringResource(id = R.string.Information),
                fontSize = 16.sp,
                color = colorResource(id = R.color.white),
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = modifier,
                text = stringResource(id = R.string.Saber),
                fontSize = 10.sp,
                color = colorResource(id = R.color.white),
                textAlign = TextAlign.Center,
            )
            Row {

                task.users.forEach { user ->
                    AsyncImage(
                        modifier = modifier
                            .padding(top = 10.dp)
                            .padding(bottom = 12.dp)
                            .clip(CircleShape)
                            .size(24.dp),
                        model = user.imageId,
                        contentDescription = null,
                    )
                    SpacerWidth(dp = 6.dp)
                }

            }
        }
    }
}