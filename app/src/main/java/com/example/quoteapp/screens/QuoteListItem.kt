package com.example.quoteapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quoteapp.model.Quote


@Composable
fun QuoteListItem(quote: Quote, onClickQuote: (quote: Quote) -> Unit) {
    val context = LocalContext.current
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(0.dp),
        modifier = Modifier
            .padding(8.dp)
            .background(color = Color.White)
            .clickable { onClickQuote(quote) },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary,
        ),
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                imageVector = Icons.Filled.FormatQuote,
                contentDescription = "Image",
                Modifier
                    .padding(2.dp, 8.dp)
                    .size(40.dp)
                    .rotate(180f)
                    .background(color = Color.Black),

                colorFilter = ColorFilter.tint(Color.White),
                alignment = Alignment.TopStart,
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = quote.quote,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                        .background(Color(0xFFEEEEEE))
                )
                Text(
                    text = quote.author,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.W300,
                    modifier = Modifier.padding(0.dp, 8.dp, 0.dp, 0.dp)

                )

            }
        }
    }
}

@Preview
@Composable
private fun PreviewRegister() {
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(0.dp),
        modifier = Modifier
            .padding(8.dp)
            .background(color = Color.White)
            .clickable { },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary,
        ),
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                imageVector = Icons.Filled.FormatQuote,
                contentDescription = "Image",
                Modifier
                    .padding(2.dp, 8.dp)
                    .size(40.dp)
                    .rotate(180f)
                    .background(color = Color.Black),

                colorFilter = ColorFilter.tint(Color.White),
                alignment = Alignment.TopStart,
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "You Can Do all things what you can think..",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                        .background(Color(0xFFEEEEEE))
                )
                Text(
                    text = "Vishal Trivedi",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.W300,
                    modifier = Modifier.padding(0.dp, 8.dp, 0.dp, 0.dp)

                )

            }
        }
    }
}
