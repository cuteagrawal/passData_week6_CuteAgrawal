package com.st991629230.passdata_cuteagrawal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var nameEt: EditText
    private lateinit var markEt: EditText
    private lateinit var averageEt: EditText
    var checkboxresult = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize EditText elements
        nameEt = findViewById(R.id.nameEt)
        markEt = findViewById(R.id.markEt)
        averageEt = findViewById(R.id.averageEt)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        checkBox.setOnCheckedChangeListener { button, b ->

            if(checkBox.isChecked){
                checkboxresult = true
            } else{
                checkboxresult = false
            }
        }

    }

    fun onSaveButtonClick(view: View) {

        // collect data from edit texts
        val name = nameEt.text.toString()
        val mark = markEt.text.toString().toInt()
        val average = averageEt.text.toString().toDouble()

        //start intent for new Activity and pass the data
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("Name", name)
        intent.putExtra("Mark", mark)
        intent.putExtra("Average", average)
        intent.putExtra("Coop", checkboxresult)

        startActivity(intent)


    }
}