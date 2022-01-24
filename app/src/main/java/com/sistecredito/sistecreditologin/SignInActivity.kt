package com.sistecredito.sistecreditologin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sistecredito.sistecreditologin.ui.theme.*

@Preview(showBackground = true, device = Devices.PIXEL_3)
@Composable
fun SignInScreen() {

    var textUser by remember {
        mutableStateOf("")
    }
    var textPass by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .background(BlueLogin)
            .fillMaxSize()
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "Arrow back",
            modifier = Modifier
                .padding(start = 30.dp, top = 40.dp)
                .size(30.dp),
            tint = Color.White
        )
        Text(
            text = "Sign in",
            style = TextStyle(
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold
            ),
            modifier = Modifier.padding(
                start = 30.dp,
                top = 30.dp,
                bottom = 40.dp
            )
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 40.dp)
                    .fillMaxSize()
            ) {
                Text(
                    text = "Welcome Back",
                    style = TextStyle(
                        color = Titles,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.ExtraBold
                    ),
                    modifier = Modifier.padding(top = 30.dp)
                )
                Text(
                    text = "Hello there, sign in to continue!",
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier.padding(top = 4.dp, bottom = 30.dp)
                )
                Text(
                    text = "Username or email",
                    style = TextStyle(
                        color = GrayText,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                TextField(
                    value = textUser,
                    onValueChange = { textUser = it },
                    placeholder = {
                        Text(
                            text = "Enter your username or email",
                            color = Color.LightGray
                        )
                    },
//                    label = {
//                        Text(
//                            text = "Enter your username or email",
//                            color = Color.LightGray,
//                            textAlign = TextAlign.Justify
//                        )
//                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(15.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = GrayLigth,
                        textColor = Titles
                    ),
                    trailingIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.Clear,
                                contentDescription = "Clear Icon",
                                tint = Color.LightGray
                            )
                        }
                    }
                )
                Text(
                    text = "Password",
                    style = TextStyle(
                        color = GrayText,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier.padding(top = 20.dp, bottom = 16.dp)
                )
                TextField(
                    value = textPass,
                    onValueChange = { textPass = it },
                    placeholder = {
                        Text(
                            text = "Enter your password",
                            color = Color.LightGray
                        )
                    },
//                    label = {
//                        Text(
//                            text = "Enter your password",
//                            color = Color.LightGray
//                        )
//                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(15.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = GrayLigth,
                        textColor = Titles
                    ),
                    trailingIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.Clear,
                                contentDescription = "Clear Icon",
                                tint = Color.LightGray
                            )
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Search
                    )
                )
                Text(
                    text = "Forgot password?",
                    style = TextStyle(
                        color = BlueLogin,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.padding(
                        top = 20.dp, bottom = 22.dp
                    )
                )
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(44.dp),
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.textButtonColors(
                        backgroundColor = BlueLogin
                    ),
                    onClick = { }
                ) {
                    Text(
                        text = "Sign in",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(30.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Text(
                            text = "Don't have an account? ",
                            style = TextStyle(
                                color = Color.Gray,
                                fontSize = 15.sp,
                                textAlign = TextAlign.Justify
                            )
                        )
                        Text(
                            text = "Sign up",
                            style = TextStyle(
                                color = BlueLogin,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Justify
                            )
                        )
                    }
                }
            }
        }
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .offset(x = 20.dp, y = (-40).dp),
        horizontalArrangement = Arrangement.End
    ) {
        Box(
            modifier = Modifier
                .size(150.dp)
                .clip(RoundedCornerShape(75.dp))
                .alpha(0.08f)
                .background(Color.White)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .offset(x = 70.dp, y = 20.dp),
        horizontalArrangement = Arrangement.End
    ) {
        Box(
            modifier = Modifier
                .size(150.dp)
                .clip(RoundedCornerShape(75.dp))
                .alpha(0.05f)
                .background(Color.White)
        )
    }
}

