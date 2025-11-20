package com.example.kk2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


object AppNavigator {

    fun navigateToSignUp(activity: Activity) {
        val intent = Intent(activity, Signup::class.java)
        activity.startActivity(intent)
        activity.finish()
    }
    fun navigateToSuccess(activity: Activity) {
        val intent = Intent(activity, Success::class.java)
        activity.startActivity(intent)
        activity.finish()
    }

    fun navigateToSignIn(activity: Activity) {
        val intent = Intent(activity, Signin::class.java)
        activity.startActivity(intent)
        activity.finish()
    }
    fun navigateToHome(activity: Activity) {
        val intent = Intent(activity, Home::class.java)
        activity.startActivity(intent)
        activity.finish()
    }

    fun loadFragment(activity: AppCompatActivity, fragment: Fragment) {
        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }


}




