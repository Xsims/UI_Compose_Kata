package com.xsims.uicomposekata

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun MyCard(
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = Modifier
            .aspectRatio(ratio = 1.4f)
            .fillMaxWidth(),
        content = content
    )
}

@Composable
fun FinalCardExample() {
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.final_card),
        contentDescription = null,
    )
}

@Composable
fun ReplaceMeByTheComponentsBelow() {
    Text(
        text = "Hello!\n\nReplace me with the components commented below me in order to recreate the card shown below.\n\nGood luck!",
        modifier = Modifier.padding(16.dp),
    )
}

@Composable
fun Description() {
    Text(
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin in vestibulum erat. Quisque ultricies, augue non porttitor ultricies, nulla arcu ultricies lorem, et lacinia dolor odio non tellus. ",
        style = MaterialTheme.typography.bodySmall,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun SeeMoreButton() {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "See more")
    }
}

@Composable
fun AddToFavoriteButton() {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "Add to favorite")
    }
}

@Composable
fun RatingText() {
    Text(
        text = "4.8/5",
        style = MaterialTheme.typography.labelSmall
    )
}

@Composable
fun StarIcon() {
    Icon(
        Icons.Rounded.Star,
        modifier = Modifier.size(14.dp),
        tint = Color(0xFFFFD700),
        contentDescription = "",
    )
}

@Composable
fun FavoriteIcon() {
    Icon(
        Icons.Outlined.FavoriteBorder,
        modifier = Modifier.size(24.dp),
        contentDescription = "",
    )
}

@Composable
fun Title() {
    Text(
        text = "Alpes",
        style = MaterialTheme.typography.bodyLarge
    )
}

@Composable
fun CoverImage() {
    Image(
        painter = painterResource(id = R.drawable.img),
        contentScale = ContentScale.FillWidth,
        contentDescription = null
    )
}
