package com.xsims.uicomposekata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.xsims.uicomposekata.ui.theme.UIComposeKataTheme


@Composable
private fun MyScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        MyCard {
            ReplaceMeByTheComponentsBelow()
//            CoverImage()
//            FavoriteIcon()
//            Title()
//            RatingText()
//            StarIcon()
//            Description()
//            SeeMoreButton()
//            AddToFavoriteButton()
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
