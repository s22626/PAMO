package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroceryAdapter(
    private val items: List<GroceryItem>,
    private val onItemClick: (position: Int) -> Unit
) : RecyclerView.Adapter<GroceryAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.itemName)
        val itemCheckBox: CheckBox = itemView.findViewById(R.id.itemCheckBox)

        init {
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_grocery_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.itemName.text = item.name
        holder.itemCheckBox.isChecked = item.isBought
        holder.itemCheckBox.setOnCheckedChangeListener { _, isChecked ->
            item.isBought = isChecked
        }
    }

    override fun getItemCount(): Int = items.size
}
