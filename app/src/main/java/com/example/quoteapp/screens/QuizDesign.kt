package com.example.quoteapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quoteapp.ui.theme.BackQuiz

@Preview
@Composable
fun QuizDesign(modifier: Modifier = Modifier) {
    Box(Modifier.fillMaxWidth()) {
        Card(
            elevation = CardDefaults.cardElevation(5.dp),
            modifier = modifier
                .background(Color.Transparent)
                .fillMaxWidth(0.8f),
            colors = CardDefaults.cardColors(BackQuiz),
            shape = RoundedCornerShape(10.dp),
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row {
                    Text(
                        text = "English",
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(horizontal = 4.dp)
                            .background(color = Color.White, RoundedCornerShape(4.dp))
                            .padding(horizontal = 4.dp),
                    )
                    Text(
                        text = "Simple Past Tense",
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(horizontal = 4.dp)
                            .background(color = Color.White, RoundedCornerShape(4.dp))
                            .padding(horizontal = 4.dp)
                    )
                }

                Text(
                    text = "Edutor is going to Fly anyhow Edutor is going to Fly anyhow Edutor is going to Fly anyhow",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleLarge,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .padding(
                            start = 4.dp,
                            end = 4.dp,
                            top = 28.dp,
                        )
                )
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Row {
                        Text(
                            text = "By Sohan Rana • 213 Hits",
                            fontWeight = FontWeight.W500,
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier
                                .padding(horizontal = 4.dp)
                                .fillMaxWidth(0.9f),
                        )

                        // Use Spacer to push the Image to the end of the Row
                        Spacer(Modifier.weight(1f))

                        Image(
                            imageVector = Icons.Filled.MoreVert,
                            contentDescription = null,
                            alignment = Alignment.BottomEnd,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clip(shape = CircleShape)
                                .background(Color.White)
                                .size(22.dp)
                        )
                    }
                }
            }
        }
    }
}