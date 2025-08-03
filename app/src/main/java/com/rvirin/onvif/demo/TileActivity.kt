package com.rvirin.onvif.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.rvirin.onvif.R

class TileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tile)

        val recycler = findViewById<RecyclerView>(R.id.recyclerView)
        recycler.layoutManager = GridLayoutManager(this, 2)
        recycler.adapter = CameraTileAdapter(emptyList())
    }
}
