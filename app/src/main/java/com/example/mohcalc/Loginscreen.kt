package com.example.mohcalc

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Loginscreen() {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.group),
            contentDescription = "Login image",
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = "Welcom bro", fontSize = 28.sp, fontWeight = Bold
        )

        Text(text = "Login to your account")
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        OutlinedTextField(value = email, onValueChange = { email = it }, label = {
            Text(text = "Email Adress")
        })
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        OutlinedTextField(value = password, onValueChange = { password = it }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        Button(onClick = { Log.i("Credential", "email: $email Pasword: $password "   ) }) {
            Text(text = "Login")

        }
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        Text(text = "Forget password?", modifier = Modifier.clickable {

        })
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        Text(text = "Or sign in with", modifier = Modifier.clickable {

        })
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp),
            horizontalArrangement = Arrangement.Absolute.SpaceEvenly
        ) {
            Image(painter = painterResource(id = R.drawable.facebook_5968764),
                contentDescription = "facebook",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {

                    })
            Image(painter = painterResource(id = R.drawable.gmail_5968534),
                contentDescription = "Gmail",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {

                    })
            Image(painter = painterResource(id = R.drawable.x_7720456),
                contentDescription = "Twitter",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {

                    })
        }


    }
}

@Preview(showSystemUi = true)
@Composable
private fun Loginscreenprev() {
    Loginscreen()
}