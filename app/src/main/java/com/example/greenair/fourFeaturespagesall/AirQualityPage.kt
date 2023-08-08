package com.example.greenair.fourFeaturespagesall

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.greenair.ui.theme.backgroundforregister

@Composable
fun FeatureAirqualitypage(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = backgroundforregister),
            verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Top),
    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        com.example.greenair.HyperLinkText(fullText = "Explore our features on our official website", linkText = listOf("official website") , hyperlinks = listOf("https://backendgreenair.azurewebsites.net/"))
    }
}

@Preview(showBackground = true)
@Composable
fun Previewoflink(){
FeatureAirqualitypage()
}