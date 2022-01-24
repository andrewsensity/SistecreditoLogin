package com.sistecredito.sistecreditologin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sistecredito.sistecreditologin.R
import com.sistecredito.sistecreditologin.ui.theme.BlueLigth
import com.sistecredito.sistecreditologin.ui.theme.BlueLogin
import com.sistecredito.sistecreditologin.ui.theme.SistecreditoLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SistecreditoLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    SignInScreen()
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .background(BlueLogin)
            .fillMaxSize()
            .padding(horizontal = 40.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.login),
                contentDescription = "main image",
                modifier = Modifier
                    .size(370.dp)
                    .fillMaxWidth()
                    .padding(top = 80.dp, start = 20.dp, end = 20.dp)
            )
        }
        Text(
            text = "Welcome",
            textAlign = TextAlign.Start,
            style = TextStyle(
                Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif
            ),
            modifier = Modifier
                .padding(bottom = 26.dp)
                .fillMaxWidth()
        )
        Text(
            text = "Manage your expenses",
            textAlign = TextAlign.Start,
            style = TextStyle(
                Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.SansSerif
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 4.dp)
        )
        Text(
            text = "seamlessly & intuitively",
            textAlign = TextAlign.Start,
            style = TextStyle(
                Color.White,
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            ),
            modifier = Modifier
                .fillMaxWidth()
        )
        Button(
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxWidth()
                .height(42.dp),
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(14.dp),
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.CenterStart
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = "Google",
                    tint = BlueLogin
                )
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Sign In with Google",
                        style = TextStyle(
                            color = BlueLogin,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
        }
        OutlinedButton(
            shape = RoundedCornerShape(14.dp),
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .height(42.dp),
            onClick = { /*TODO*/ },
            border = BorderStroke(1.dp, Color.White),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = BlueLogin
            )
        ) {
            Text(
                text = "Create an account",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            Arrangement.Center
            ) {
            Text(
                text = "Already have an account? ",
                style = TextStyle(
                    color = BlueLigth,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Justify
                )
            )
            Text(
                text = "Sign in",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify
                )
            )
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_3)
@Composable
fun LoginScreenPreview() {
    SistecreditoLoginTheme {
        LoginScreen()
    }
}
//@Preview(showBackground = true, device = Devices.PIXEL_3)
//@Composable
//fun SignInScreenPreview() {
//    SistecreditoLoginTheme {
//        SignInScreen()
//    }
//}