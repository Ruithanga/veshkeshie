package com.example.playlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.playlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.lastViewCard.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)

            startActivity(intent)
        }

        val myAdapter = MyAdapter(this,Data.dataList)
        binding.apply {
            recyclerView.adapter = myAdapter
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}
