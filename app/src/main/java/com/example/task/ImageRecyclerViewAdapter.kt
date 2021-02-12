package com.example.task

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class ImageRecyclerViewAdapter(private var list:List<Int>,var context: Context):RecyclerView.Adapter<ImageRecyclerViewAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: ImageView = itemView.findViewById(R.id.image)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.image_recycler, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.setImageDrawable(
                ContextCompat.getDrawable(
                        context, // Context
                        list[position] // Drawable
                ))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}