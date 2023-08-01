package com.example.greenair

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.greenair.ui.theme.Purple40
import kotlinx.coroutines.delay

@Composable
fun AnimatesSplashScreen(navController: NavController){
    var startAnimation by remember { mutableStateOf(false) }
    val alphaAni= animateFloatAsState(
        targetValue = if(startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 3000
        )
    )
    LaunchedEffect(key1 = true ){
        startAnimation=true
        delay( 4000)
        navController.navigate(com.example.greenair.Navigationpackage.Screen.Home.route)

    }
    Splash(alpha = alphaAni.value)
}
@Composable
fun Splash(alpha:Float){
    Box(modifier = Modifier
        .background(if (isSystemInDarkTheme()) Color.White else Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(
            modifier= Modifier
                .size(600.dp)
                .alpha( alpha=alpha),
            painter = painterResource(R.drawable.animatelogo),
            contentDescription = "logo icon",
        )
    }
}