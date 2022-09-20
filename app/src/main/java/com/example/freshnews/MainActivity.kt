package com.example.freshnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val area : RecyclerView = findViewById<RecyclerView>(R.id.newsplace)
        area.layoutManager = LinearLayoutManager(this)
        val items = fetchdata()
        val adapter = NewsListAdapter(items, this)
        area.adapter = adapter
    }
    private fun fetchdata(): ArrayList<String>{
        val list = ArrayList<String>()
        for(i in 0 until 100){
            list.add("Item $i")
        }
        return  list
    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this,"Clicked item $item", Toast.LENGTH_LONG).show()
    }

}