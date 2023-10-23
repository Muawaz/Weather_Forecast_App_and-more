package com.example.compose_quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_quadrant.ui.theme.Compose_QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Text composable",
                        "Displays text and follows the recommended Material Design guidelines.",
                        "Image composable",
                        "Creates a composable that lays out and draws a given Painter class object.",
                        "Row composable",
                        "A layout composable that places its children in a horizontal sequence.",
                        "Column composable",
                        "A layout composable that places its children in a vertical sequence.")
                }
            }
        }
    }
}

@Composable
fun Greeting(s1: String, s2: String, s3: String, s4: String, s5: String, s6: String, s7: String, s8: String, modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxWidth()) {
//        First Row / Top Row
        Row(Modifier.weight(1f)) {
//            Top Left Quadrant
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFEADDFF))
                    .weight(1f)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = s1,
                    modifier = modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold,
                )
                Text (
                    text = s2,
                    textAlign = TextAlign.Justify,
                )
            }

//            Top Right Quadrant
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFD0BCFF))
                    .weight(1f)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = s3,
                    modifier = modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold,
                )
                Text (
                    text = s4,
                    textAlign = TextAlign.Justify,
                )
            }
        }

//        Second Row / Bottom Row
        Row(Modifier.weight(1f)) {
//            Bottom Left Quadrant
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFB69DF8))
                    .weight(1f)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = s5,
                    modifier = modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold,
                )
                Text (
                    text = s6,
                    textAlign = TextAlign.Justify,
                )
            }

//            Bottom Right Quadrant
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF6EDFF))
                    .weight(1f)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = s7,
                    modifier = modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold,
                )
                Text (
                    text = s8,
                    textAlign = TextAlign.Justify,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_QuadrantTheme {
        Greeting("Text composable",
            "Displays text and follows the recommended Material Design guidelines.",
            "Image composable",
            "Creates a composable that lays out and draws a given Painter class object.",
            "Row composable",
            "A layout composable that places its children in a horizontal sequence.",
            "Column composable",
            "A layout composable that places its children in a vertical sequence.")

    }
}