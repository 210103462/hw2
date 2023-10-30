package com.example.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var imageId: Array<Int>
    lateinit var heading : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.caspian,
            R.drawable.sdu,
            R.drawable.kaznu,
            R.drawable.kbtu,
            R.drawable.uib
        )
        heading = arrayOf(
            "Caspian University",
            "SDU University",
            "Kaznu University",
            "KBTU University",
            "UIB University"
        )
        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList =  arrayListOf<news>()
        getuserdata()
    }

    private fun getuserdata() {
        for(i in imageId.indices){
            val news = news(imageId[i],heading[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter = Myadapter(newArrayList)
    }
}