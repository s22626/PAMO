package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class GroceryListActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery_list)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        NavigationUtils.setupBottomNavigation(this, bottomNavigationView)

        val groceryItems = mutableListOf(
            GroceryItem("Milk"),
            GroceryItem("Bread"),
            GroceryItem("Eggs")
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = GroceryAdapter(groceryItems) { position ->
            // Handle item click here
            // For example, toggle the "bought" status of the clicked item
            groceryItems[position].isBought = !groceryItems[position].isBought
            recyclerView.adapter?.notifyItemChanged(position)
        }
        recyclerView.adapter = adapter



    }
}
