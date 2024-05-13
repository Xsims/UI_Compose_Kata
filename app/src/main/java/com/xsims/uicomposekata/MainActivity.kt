package com.xsims.uicomposekata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.xsims.uicomposekata.ui.theme.UIComposeKataTheme


@Composable
private fun MyScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        MyCard {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
                propagateMinConstraints = true
            ) {
                CoverImage()
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.TopEnd)
                        .padding(8.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(8.dp),
                    ) {
                        FavoriteIcon()
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(top = 16.dp),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Title()
                    Row {
                        RatingText()
                        StarIcon()
                    }
                }
                Description()
                Row(modifier = Modifier.align(Alignment.End)) {
                    SeeMoreButton()
                    AddToFavoriteButton()
                }
            }
        }
        FinalCardExample()
    }
}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { UIComposeKataTheme { MyScreen() } }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun MyPreview() { UIComposeKataTheme { MyScreen() } }
