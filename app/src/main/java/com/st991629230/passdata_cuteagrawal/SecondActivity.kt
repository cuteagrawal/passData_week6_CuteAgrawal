package com.st991629230.passdata_cuteagrawal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.st991629230.passdata_cuteagrawal.databinding.ActivityMainBinding
import com.st991629230.passdata_cuteagrawal.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setTitle("Cute Agrawal 991629230")

        //get intent object, and data from intent
        val intent = getIntent()
        val name = intent.getStringExtra("Name")
        val mark = intent.getIntExtra("Mark", 0)
        val average = intent.getDoubleExtra("Average", 0.0)
        val coop = intent.getBooleanExtra("Coop", false)
        val age = intent.getIntExtra("Age", 0)

        //form one textview for the final result
        val resultTv: TextView = findViewById(R.id.resultTv)
        resultTv.text = "Collected information \n\nName: " + name + "\nMark: " + mark + "\nAverage: " + average +
                "\nCoop: " + coop + "\nAge: " + age

    }

    fun onClose(view: View){
        finish()
    }
}