package com.example.greenair

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.greenair.ui.theme.Caprasimo
import com.example.greenair.ui.theme.Pink80
import com.example.greenair.ui.theme.Quicksandfamily
import com.example.greenair.ui.theme.features
import com.example.greenair.ui.theme.green1
import com.example.greenair.ui.theme.green2
import com.example.greenair.ui.theme.individualfeature
import com.example.greenair.ui.theme.ysabeau

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllFeatures(){
    Scaffold() {
            it->
        LazyRow(contentPadding =it ){
            items(features){
                Pageone(
                    dog = it,
                    gradient = Brush.horizontalGradient(colors= listOf(green1,green2))
                )
            }
        }
    }
}
@Composable
fun Pageone(
    dog: individualfeature,
    gradient: Brush
) {
    Card(
        modifier= Modifier.padding(10.dp),
        shape= MaterialTheme.shapes.small
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(gradient),

                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Greeting(dog.imageResourceId)
                TextFeatureone(dog.name,dog.subname,dog.Description, Color(0xFF1C5235), Color.Black)

            }
        }
    }
}
//@Composable
//fun Appfeatureone(){
//    Column {
//        Greeting()
//        Spacer(
//            modifier = Modifier
//                .height(40.dp)
//        )
//        TextFeatureone(Color(0xFF1C5235),Color.Black)
//    }
//}
@Composable
fun Greeting(animation:Int ) {
    val composition= rememberLottieComposition(LottieCompositionSpec.RawRes(animation))
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
fun TextFeatureone(feature_name:Int, feature_sub:Int, feature_description:Int, textcolor: Color, descriptionColor: Color) {
    Card(modifier= Modifier.padding(10.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            modifier = Modifier
                .background(Color.LightGray),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = feature_name),
                modifier = Modifier,
                style = MaterialTheme.typography.bodyLarge,
                color = textcolor,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                fontFamily= Caprasimo,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = feature_sub),
                modifier = Modifier,
                style = MaterialTheme.typography.bodyLarge,
                color = textcolor,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                fontFamily= Quicksandfamily,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = stringResource(feature_description),
                color = descriptionColor,
                fontFamily = ysabeau,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(30.dp))
            Gradient1Button(text = "Start", textColor = Color.White)
        }
    }
}
@Composable
fun Gradient1Button(
    text:String,
    textColor: Color
){
    Button(
        colors= ButtonDefaults.buttonColors(Color.Transparent),
        contentPadding = PaddingValues(),
        onClick = { },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(60.dp)
            .width(150.dp)
    )
    {
        Box(modifier = androidx.compose.ui.Modifier
            .background(Pink80)
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text,
                color=textColor,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold)
        }
    }
}
//@Preview
//@Composable
//fun Previewanimation(){
//   TextFeatureone(Color(0xFF1C5235), Color.Black)
//}