package com.example.kk2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.content.Intent
class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signUpButton = findViewById<Button>(R.id.buttonSignUp)
        val signInText = findViewById<TextView>(R.id.transitionSignIn)

        signInText.setOnClickListener {
            navigateToSignIn()
        }
        signUpButton.setOnClickListener {
            navigateToSuccess()
        }

    }
    private fun navigateToSignIn() {
        val intent = Intent(this, Signin::class.java)
        startActivity(intent)
        finish()
    }
    private fun navigateToSuccess() {
        val intent = Intent(this, Success::class.java)
        startActivity(intent)
        finish()
    }
}