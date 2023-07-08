package com.example.greenair

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.greenair.Navigationpackage.Navigation
import com.example.greenair.ui.theme.GreenAirTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GreenAirTheme {
                // A surface container using the 'background' color from the theme
              navController= rememberNavController()
Navigation()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreenAirTheme {
        Greeting("Android")
    }
}