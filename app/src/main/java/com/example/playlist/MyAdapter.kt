package com.example.playlist

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.example.playlist.databinding.ItemsBinding
import java.text.FieldPosition

class MyAdapter(val context: Context, private val items: List<Items>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val items: ItemsBinding = ItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MyViewHolder(items)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items[position]
        holder.setData(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }


    inner class MyViewHolder(private val binding: ItemsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setData(items: Items){
            binding.apply {
                profileImage.setImageResource(items.image)
                name.text = items.name
                desc.text = items.desc
            }

        }
    }

}