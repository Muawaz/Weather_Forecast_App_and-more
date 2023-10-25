package com.example.weather_forecast_s2

import android.graphics.ColorSpace
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather_forecast_s2.ui.theme.Weather_Forecast_S2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Weather_Forecast_S2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    SecondScreen()
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Composable
fun SecondScreen() {

    Column()
    {
//        Top Row
//        First Row
        Row(Modifier.weight(0.60f))
        {
//            Top Left Column
//            First Column
//            back, location, option, para, button

            Column(modifier = Modifier.weight(0.50f))
            {
                Row()
                {
                    Column(modifier = Modifier.padding(start = 5.dp, top = 10.dp))
                    {
                        Icon(
                            Icons.Rounded.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }

                    Column(modifier = Modifier.padding(10.dp))
                    {
                        Text(
                            text = "LOCATIONS",
                            modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                            color = Color.Gray,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                        )
                    }

                    Column(
                        modifier = Modifier.fillMaxWidth().padding(10.dp),
                        horizontalAlignment = Alignment.End
                    )
                    {
                        Icon(
                            Icons.Rounded.MoreVert,
                            contentDescription = "Localized description"
                        )
                    }
                }
                Row()
                {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    )
                    {
                        Text(
                            text = "You are currently getting results for popular place from Pakistan",
                            modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Light,
                            textAlign = TextAlign.Left,
                        )

                        ButtonWithRoundCornerShape()
                    }
                }
            }

//            Top Right Column
//            Second Column
//            add icon, add place
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.25f)
                    .background(Color(248, 235, 255)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            )
            {
                Icon(
                    Icons.Rounded.Add,
                    contentDescription = "Localized description",
//                    color = Color.DarkGray,
                )

                Text(
                    text = "Add Place",
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                    color = Color.DarkGray,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }

//        Second Row
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color(0, 59, 168))
            .alpha(0.6f)
            .padding(10.dp)
            .weight(0.25f))
        {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
            )
            {
                Text(
                    text = "Karachi",
                    color = Color.White,
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                )

                Text(
                    text = "Humidity : 51%",
                    color = Color.LightGray,
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            )
            {
                Text(
                    text = "28, Sunny",
                    color = Color(255, 127, 92),
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center,
                )
            }
        }

//        Third Row
        Row(modifier = Modifier
            .fillMaxWidth()
            .alpha(0.6f)
            .padding(10.dp)
            .weight(0.25f))
        {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
            )
            {
                Text(
                    text = "Islamabad",
                    color = Color.DarkGray,
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                )

                Text(
                    text = "Humidity : 35%",
                    color = Color.DarkGray,
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            )
            {
                Text(
                    text = "24, Smoke",
                    color = Color.DarkGray,
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }

//        Fourth Row
        Row(modifier = Modifier
            .fillMaxWidth()
            .alpha(0.6f)
            .padding(10.dp)
            .weight(0.25f))
        {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
            )
            {
                Text(
                    text = "Faisalabad",
                    color = Color.DarkGray,
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                )

                Text(
                    text = "Humidity : 35%",
                    color = Color.DarkGray,
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            )
            {
                Text(
                    text = "21, Clear",
                    color = Color.DarkGray,
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}


@Composable
fun ButtonWithRoundCornerShape() {
    Button(onClick = {}, shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .padding(20.dp))
    {
        Text(text = "Choose place")
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Weather_Forecast_S2Theme {
//        Greeting("Android")
        SecondScreen()
    }
}