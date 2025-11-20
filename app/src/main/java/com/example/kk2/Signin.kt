package com.example.kk2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sign

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val signInButton = findViewById<LinearLayout>(R.id.buttonSignIn)
        val signUpText = findViewById<TextView>(R.id.transitionSignUp)
        val emailInput = findViewById<EditText>(R.id.email)
        val passwordInput = findViewById<EditText>(R.id.password)
        signUpText.setOnClickListener {
            AppNavigator.navigateToSignUp(this)
        }
        signInButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()


            if(email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please Fill all the field", Toast.LENGTH_SHORT).show()
            } else {
                AppNavigator.navigateToSuccess(this)
            }
        }

    }

}