package com.st991629230.passdata_cuteagrawal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import com.st991629230.passdata_cuteagrawal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var checkboxresult = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    supportActionBar?.setTitle("Cute Agrawal 991629230")

        binding.checkBox.setOnCheckedChangeListener { button, b ->

            if(binding.checkBox.isChecked){
                checkboxresult = true
            } else{
                checkboxresult = false
            }
        }

    }

    fun onSaveButtonClick(view: View) {

        // collect data from edit texts
        val name = binding.nameEt.text.toString()
        val mark = binding.markEt.text.toString().toInt()
        val average = binding.averageEt.text.toString().toDouble()

        //age
        val age = binding.ageEt.text.toString().toInt()


        //start intent for new Activity and pass the data
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("Name", name)
        intent.putExtra("Mark", mark)
        intent.putExtra("Average", average)
        intent.putExtra("Coop", checkboxresult)

        //age
        intent.putExtra("Age", age)

        startActivity(intent)


    }
}