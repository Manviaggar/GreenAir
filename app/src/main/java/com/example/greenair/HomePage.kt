package com.example.greenair

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.greenair.Navigationpackage.Screen
import com.example.greenair.ui.theme.buttoncolor
import com.example.greenair.ui.theme.white

@Composable
fun HomePage(navController: NavController) {
    Box(
        modifier= Modifier.fillMaxSize(),
        contentAlignment= Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.backgroundimage3),
            contentDescription = "null",
            modifier= Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha=0.8f
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .fillMaxHeight(),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Greeting()
            Spacer(
                modifier = Modifier
                    .height(40.dp)
            )
            Button(
                colors= ButtonDefaults.buttonColors(Color.Transparent),
                contentPadding = PaddingValues(),
                onClick = {
                    navController.navigate(Screen.Register.route)
                }
            )
            {
                Box(modifier = Modifier
                    .size(width = 9000.dp,height = 40.dp)
                    .background(buttoncolor)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                    contentAlignment = Alignment.Center) {
                    Text(text = "Register",
                        color = white,
                        fontWeight = FontWeight.W800
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
                Button(
                    colors= ButtonDefaults.buttonColors(Color.Transparent),
                    contentPadding = PaddingValues(),
                    onClick = { }
                )
                {
                    Box(modifier = Modifier
                        .size(width = 9000.dp,height = 40.dp)
                        .background(buttoncolor)
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                        contentAlignment = Alignment.Center) {
                        Text(text = "Login",color=white, fontWeight = FontWeight.W800)
                    }
                }
        }
    }
}

@Composable
fun Greeting() {
    val composition= rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation1))
    val progress by animateLottieCompositionAsState(
        composition = composition.value,
        iterations = LottieConstants.IterateForever
    )
    LottieAnimation(modifier= Modifier.size(400.dp),
        composition = composition.value,
        progress = { progress})
    Alignment.Center
    Arrangement.Center
}

@Composable
fun GradientButton(
    text:String
){
    Button(
        colors= ButtonDefaults.buttonColors(Color.Transparent),
        contentPadding = PaddingValues(),
        onClick = { }
    )
    {
        Box(modifier = Modifier
            .background(buttoncolor)
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text,color=white)
        }
    }
}
@Composable
fun buttonclick(text:String){
    Button(onClick = { },modifier = Modifier.fillMaxWidth()) {
        Text(text, Modifier.padding(vertical = 8.dp))
    }
}
