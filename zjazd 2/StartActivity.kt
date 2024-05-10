package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class StartActivity : AppCompatActivity() {
    private val delayMillis: Long = 3000 // 3 seconds delay

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        // Post a delayed action to start the MainActivity after the delay
        Handler().postDelayed({
            // Start MainActivity
            startActivity(Intent(this, MainActivity::class.java))
            // Finish StartActivity so it's not in the back stack
            finish()
        }, delayMillis)
    }
}