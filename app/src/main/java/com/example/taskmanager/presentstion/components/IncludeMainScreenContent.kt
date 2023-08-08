package com.example.taskmanager.presentstion.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.R
import com.example.taskmanager.domain.models.TaskACT
import com.example.taskmanager.ui.theme.TaskManagerTheme


@Preview
@Composable
fun IncludeMainScreenContentPreview() {
    TaskManagerTheme {
        IncludeMainScreenContent(
            category = TaskACT.preview
        )
    }
}

@Composable
fun IncludeMainScreenContent(
    modifier: Modifier = Modifier,
    category: TaskACT
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Column(
            modifier = modifier

        ) {
            Text(
                modifier = modifier.padding(top = 31.dp),
                text = stringResource(id = R.string.Surf),
                fontSize = 28.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = R.string.predning),
                fontSize = 14.sp,
                color = colorResource(id = R.color.grey),
                textAlign = TextAlign.Center,
            )

        }
    }
}
