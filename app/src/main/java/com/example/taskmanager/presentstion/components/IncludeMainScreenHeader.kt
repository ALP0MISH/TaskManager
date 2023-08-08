package com.example.taskmanager.presentstion.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.taskmanager.R
import com.example.taskmanager.domain.models.User
import com.example.taskmanager.ui.theme.TaskManagerTheme

@Preview
@Composable
fun MainScreenPreview() {
    TaskManagerTheme {
        MainScreenHeader(
            user = User.preview
        )
    }
}

@Composable
fun MainScreenHeader(
    modifier: Modifier = Modifier,
    user: User,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
    ) {
        Row(
            modifier = modifier
        ) {
            Column(
                modifier = modifier
            ) {
                Text(
                    modifier = modifier.padding(top = 64.dp),
                    text = stringResource(id = R.string.monday),
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.grey),
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = stringResource(id = R.string.october),
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            }
            Card(
                modifier = modifier
                    .padding(start = 68.dp)
                    .padding(top = 60.dp)
                    .height(56.dp)
                    .width(56.dp)
                    .clip(CircleShape),

                ) {
                Spacer(modifier = modifier.padding(start = 60.dp))
                Icon(
                    modifier = modifier.padding(16.dp),
                    painter = painterResource(id = R.drawable.search_icon),
                    contentDescription = null,
                )
            }
            AsyncImage(
                modifier = modifier
                    .padding(top = 60.dp)
                    .padding(start = 16.dp)
                    .size(58.dp)
                    .clip(CircleShape),
                model = user.imageId,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
    }
}
