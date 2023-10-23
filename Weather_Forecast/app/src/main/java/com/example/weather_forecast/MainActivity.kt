package com.example.weather_forecast

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather_forecast.ui.theme.Weather_ForecastTheme
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Weather_ForecastTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposedImage()
                }
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



@SuppressLint("SimpleDateFormat")
@Composable
fun ComposedImage(modifier: Modifier = Modifier) {
//    val image = painterResource(R.drawable.good_weather_gradient_cloud)

    Column ()
    {
        Column (
                modifier = Modifier
                    .weight(1f, fill = true)
                    .paint(
                        // Replace with your image id
                        painterResource(R.drawable.burj_khalifa),

//                    modifier = Modifier.,
                        contentScale = ContentScale.FillBounds
                    )
            )
        {
            Row(
                modifier = Modifier.padding(top= 30.dp),
            )
            {
//                Right Column; Menu Location Temp
                Column(
                    modifier = Modifier.padding(start= 20.dp),
                )
                {
                    Row()
                    {
                        Icon(
                            Icons.Rounded.Menu,
                            contentDescription = "Localized description"
                        )

                        Text(
                            text = "Lahore",
                            modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                            textAlign = TextAlign.Center,
                        )
                    }

                    Row(modifier = Modifier.padding(top=20.dp),)
                    {
                        Text(
                            text = "10",
                            modifier = Modifier.padding(start = 5.dp),
                            fontSize = 40.sp,
                        )

                        Column()
                        {
                            Text(
                                text = "\u2103",
                                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp),
                                fontSize = 10.sp,
                            )

                            Text(
                                text = "Windy Cold",
                                modifier = Modifier.padding(top = 5.dp),
                                fontSize = 10.sp,
                            )
                        }
                    }
                }

//                Left Column; Search Setting Date Time
                Column(
//                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
//                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier.weight(1f).padding(end= 20.dp),
//                    Spacer(Modifier.weight(1f))
                )
                {
                    Row()
                    {
                        Icon(
                            Icons.Rounded.Search,
                            modifier = Modifier.padding(end = 10.dp),
                            contentDescription = "Localized description"
                        )

                        Icon(
                            Icons.Rounded.Settings,
                            modifier = Modifier.padding(end = 10.dp),
//                    modifier = Modifier.
//                    textAlign = TextAlign.Left,
                            contentDescription = "Localized description"
                        )
                    }

                    Row (modifier = Modifier.padding(top=20.dp),)
                    {
                        val sdf = SimpleDateFormat("dd-MM-yyyy '\n'HH:mm:ss")
                        val currentDateAndTime = sdf.format(Date())
                        Text(
                            text = currentDateAndTime,
//                            modifier = Modifier.padding(start = 90.dp),
                            fontSize = 20.sp,
                        )
                    }
                }
            }
        }
        Column ()
        {
//                Row of Name of the Days
                Row(
//                    modifier = Modifier.padding(15.dp)
                    modifier = Modifier.padding(15.dp).fillMaxWidth().weight(1f, fill = false)
                )
                {
                    Column()
                    {
                        Text(
                            text = "MON",
                            modifier = Modifier.padding(12.dp),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Column()
                    {

                        Text(
                            text = "TUES",
                            modifier = Modifier.padding(12.dp),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Column()
                    {
                        Text(
                            text = "WED",
                            modifier = Modifier.padding(12.dp),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Column()
                    {
                        Text(
                            text = "THUR",
                            modifier = Modifier.padding(12.dp),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                    }

                    Column()
                    {
                        Text(
                            text = "FRI",
                            modifier = Modifier.padding(12.dp),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }

//                Row of the images of the conditions
                Row (
//                    modifier = Modifier.padding(10.dp)
                    modifier = Modifier.padding(10.dp).fillMaxWidth().weight(1f, fill = false)
                )
                {
                    Column(
                        modifier = Modifier.padding(start=12.dp, end=12.dp)
                    )
                    {
//                        Monday
                        Image(
                            painter = painterResource(R.drawable.cloud),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
//                        contentDescription = stringResource(id = R.string.bus_content_description)
                        )
                    }

                    Column(
                        modifier = Modifier.padding(start=12.dp, end=12.dp)
                    )
                    {
//                        Tuesday
                        Image(
                            painter = painterResource(R.drawable.sunny),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
//                        contentDescription = stringResource(id = R.string.bus_content_description)
                        )
                    }

                    Column(
                        modifier = Modifier.padding(start=12.dp, end=12.dp)
                    )
                    {
//                        Wednesday
                        Image(
                            painter = painterResource(R.drawable.cloud),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
//                        contentDescription = stringResource(id = R.string.bus_content_description)
                        )

                    }

                    Column(
                        modifier = Modifier.padding(start=12.dp, end=12.dp)
                    )
                    {
//                        Thursday
                        Image(
                            painter = painterResource(R.drawable.sunny),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
//                        contentDescription = stringResource(id = R.string.bus_content_description)
                        )

                    }

                    Column(
                        modifier = Modifier.padding(start=12.dp, end=12.dp)
                    )
                    {
//                        Friday
                        Image(
                            painter = painterResource(R.drawable.cloud),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
//                        contentDescription = stringResource(id = R.string.bus_content_description)
                        )
                    }

                }

//                Row of the values of the temperature
                Row(
//                    modifier = Modifier.padding(20.dp).fillMaxWidth().weight(1f, fill = false)
                    horizontalArrangement = Arrangement.spacedBy(25.dp),
                    modifier = Modifier.padding(30.dp)

                )
                {
                    Column(
                        modifier = Modifier
                            .weight(5f)
                    )
                    {
//                        Monday
                        Text(
                            text = "10",
//                            modifier = Modifier.padding(start=20.dp, end=20.dp, top=5.dp, bottom=5.dp),
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center
//                        fontWeight = FontWeight.Bold
                        )
                    }

                    Column(
                        modifier = Modifier
                            .weight(5f)
                    )
                    {
//                        Tuesday
                        Text(
                            text = "15",
//                            modifier = Modifier.padding(start=20.dp, end=20.dp, top=5.dp, bottom=5.dp),
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center
//                        fontWeight = FontWeight.Bold
                        )
                    }

                    Column(
                        modifier = Modifier
                            .weight(5f)
                    )
                    {
//                        Wednesday
                        Text(
                            text = "13",
//                            modifier = Modifier.padding(start=20.dp, end=20.dp, top=5.dp, bottom=5.dp),
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center
//                        fontWeight = FontWeight.Bold
                        )
                    }

                    Column(
                        modifier = Modifier
                            .weight(5f)
                    )
                    {
//                        Thursday
                        Text(
                            text = "14",
//                            modifier = Modifier.padding(start=20.dp, end=20.dp, top=5.dp, bottom=5.dp),
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center
//                        fontWeight = FontWeight.Bold
                        )
                    }

                    Column(
                        modifier = Modifier
                            .weight(5f)
                    )
                    {
//                        Friday
                        Text(
                            text = "11",
//                            modifier = Modifier.padding(start=20.dp, end=20.dp, top=5.dp, bottom=5.dp),
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center
//                        fontWeight = FontWeight.Bold
                        )
                    }
                }
        }

    }



}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Weather_ForecastTheme {
//        Greeting("Android")
        ComposedImage()
    }

}