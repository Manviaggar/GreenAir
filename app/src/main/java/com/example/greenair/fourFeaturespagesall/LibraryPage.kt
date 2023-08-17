package com.example.greenair.fourFeaturespagesall

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.greenair.ui.theme.backgroundforregister

@Composable
fun LibraryPage(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = backgroundforregister)) {
        com.example.greenair.HyperLinkText(fullText = "Explore our features on our official website", linkText = listOf("official website") , hyperlinks = listOf("https://social-impact-front-end.vercel.app/"))
    }
}