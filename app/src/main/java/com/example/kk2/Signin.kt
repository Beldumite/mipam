package com.example.kk2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import kotlin.math.sign

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val signInButton = findViewById<Button>(R.id.buttonSignIn)
        val signUpText = findViewById<TextView>(R.id.transitionSignUp)

        signUpText.setOnClickListener {
            navigateToSignUp()
        }
        signInButton.setOnClickListener {
            navigateToSuccess()
        }

    }

    private fun navigateToSignUp() {
        val intent = Intent(this, Signup::class.java)
        startActivity(intent)
        finish()
    }
    private fun navigateToSuccess() {
        val intent = Intent(this, Success::class.java)
        startActivity(intent)
        finish()
    }
}