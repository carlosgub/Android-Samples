package com.carlosgub.samples.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import com.carlosgub.samples.R

class ComposeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Preview
@Composable
fun NewsStory() {

    val image = +imageResource(R.drawable.header)

    MaterialTheme {
        val typography = +MaterialTheme.typography()
        Card(shape = RoundedCornerShape(8.dp)) {
            Column(
                modifier = Spacing(16.dp)
            ) {
                Container(modifier = Height(180.dp) wraps Expanded) {
                    Clip(shape = RoundedCornerShape(8.dp)) {
                        DrawImage(image)
                    }
                }
                HeightSpacer(16.dp)
                Text(
                    "A day wandering through the sandhills " +
                            "in Shark Fin Cove, and a few of the " +
                            "sights I saw",
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = typography.h6
                        .withOpacity(0.87f)
                )
                Text(
                    "Davenport, California",
                    style = typography.body2
                        .withOpacity(0.87f)
                )
                Text(
                    "December 2018",
                    style = typography.body2
                        .withOpacity(0.6f)
                )
            }
        }
    }
}