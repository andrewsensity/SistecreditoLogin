package com.sistecredito.sistecreditologin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sistecredito.sistecreditologin.ui.theme.SistecreditoLoginTheme
import javax.security.auth.login.LoginException

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SistecreditoLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Register()
                }
            }
        }
    }
}

@Composable
fun Register() {
    Column(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize()
            .padding(horizontal = 30.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.main),
                contentDescription = "main image",
                modifier = Modifier
                    .size(300.dp)
                    .fillMaxWidth()
                    .padding(top = 80.dp, bottom = 20.dp, start = 20.dp, end = 20.dp)
            )
        }
        Text(
            text = "Welcome",
            textAlign = TextAlign.Start,
            style = TextStyle(
                Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            ),
            modifier = Modifier
                .padding(vertical = 30.dp)
                .fillMaxWidth()
        )
        Text(
            text = "Manage your expenses",
            textAlign = TextAlign.Start,
            style = TextStyle(
                Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.SansSerif
            ),
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = "seamlessly & intuitively",
            textAlign = TextAlign.Start,
            style = TextStyle(
                Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            ),
            modifier = Modifier
                .fillMaxWidth()
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(top = 40.dp)
                .background(Color.White)
                .fillMaxWidth()
        ) {
            Row{
                Icon(
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = "Google",
                )
                Text(
                    text = "Sign In with Google",
                    style = TextStyle(
                        color = Color.Blue,
                        fontSize = 16.sp
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SistecreditoLoginTheme {
        Register()
    }
}