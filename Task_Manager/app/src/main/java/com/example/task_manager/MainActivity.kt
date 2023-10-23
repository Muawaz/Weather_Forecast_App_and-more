package com.example.task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task_manager.ui.theme.Task_ManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task_ManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface( color = MaterialTheme.colorScheme.background) {
                    GreetingImage("All tasks completed", "Nice work!")
                }
            }
        }
    }
}

@Composable
fun Greeting(s1: String, s2: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = s1,
            Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = s2,
            fontSize = 16.sp,
        )
    }
}

@Composable
fun GreetingImage(s1: String, s2: String) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Image (
            painter = image,
            contentDescription = null,
        )
        Greeting(
            s1 = s1,
            s2 = s2,
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Task_ManagerTheme {
        GreetingImage("All tasks completed", "Nice work!")
    }
}