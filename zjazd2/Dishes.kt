package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Dishes : AppCompatActivity()  {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        NavigationUtils.setupBottomNavigation(this, bottomNavigationView)
}
}