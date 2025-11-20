package com.example.kk2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.content.Intent
class Success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val continueButton = findViewById<Button>(R.id.continueButton)

        continueButton.setOnClickListener {
            AppNavigator.navigateToHome(this)
        }
    }


}