package com.example.kk2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.content.Intent
import android.content.SharedPreferences
import android.widget.Toast
class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signUpButton = findViewById<Button>(R.id.buttonSignUp)
        val signInText = findViewById<TextView>(R.id.transitionSignIn)
        val emailInput = findViewById<EditText>(R.id.email)
        val usernameInput = findViewById<EditText>(R.id.username)
        val passwordInput = findViewById<EditText>(R.id.password)


        signInText.setOnClickListener {
            navigateToSignIn()
        }
        signUpButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()
            val username = passwordInput.text.toString()

            if(email.isEmpty() || password.isEmpty() || username.isEmpty()) {
                Toast.makeText(this, "Please Fill all the field", Toast.LENGTH_SHORT).show()
            }

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