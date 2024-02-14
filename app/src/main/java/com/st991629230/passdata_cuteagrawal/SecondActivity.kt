package com.st991629230.passdata_cuteagrawal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //get intent object, and data from intent
        val intent = getIntent()
        val name = intent.getStringExtra("Name")
        val mark = intent.getIntExtra("Mark", 0)
        val average = intent.getDoubleExtra("Average", 0.0)
        val coop = intent.getBooleanExtra("Coop", false)

        //form one textview for the final result
        val resultTv: TextView = findViewById(R.id.resultTv)
        resultTv.text = "Collected information \n\nName: " + name + "\nMark: " + mark + "\nAverage: " + average +
                "\nCoop: " + coop

    }
}