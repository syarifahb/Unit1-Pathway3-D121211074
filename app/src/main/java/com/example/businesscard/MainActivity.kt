package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(
                        name = "Syarifah Balqis" ,
                        title = "Informatics Engineering"
                    )
                    Contact(
                        email = "syarifahb04@gmail.com",
                        telp = "087883896767",
                        instagram = "kyraaa0915"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bgblue)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 0.5f,
        modifier = Modifier
            .fillMaxSize()
    )
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(8.dp)
    ){
        Image(
            painter = painterResource(R.drawable.syarifahb),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .padding(10.dp)
        )
        Text(
            text = name,
            fontSize = 25.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center,
            style = androidx.compose.ui.text.TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(
            text = title,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(7.dp)
        )
    }
}

@Composable
fun Contact(email: String, telp: String, instagram: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = modifier
                .padding(
                    bottom = 34.dp,
                    start = 34.dp
                )
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val image = painterResource(R.drawable.email)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = modifier
                        .padding(horizontal = 10.dp)
                        .height(25.dp)
                        .width(25.dp)
                )
                Text(
                    text = email,
                    fontSize = 15.sp
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val image = painterResource(R.drawable.telp)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = modifier
                        .padding(horizontal = 10.dp)
                        .height(25.dp)
                        .width(25.dp)
                )
                Text(
                    text = telp,
                    fontSize = 15.sp
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val image = painterResource(R.drawable.instagram)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = modifier
                        .padding(horizontal = 10.dp)
                        .height(25.dp)
                        .width(25.dp)
                )
                Text(
                    text = instagram,
                    fontSize = 15.sp
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard(
            name = "Syarifah Balqis" ,
            title = "Informatics Engineering"
        )
        Contact(
            email = "syarifahb04@gmail.com",
            telp = "087883896767",
            instagram = "kyraaa0915"
        )
    }
}