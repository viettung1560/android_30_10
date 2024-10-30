package com.example.android_30_10_2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import kotlin.math.sqrt

class NumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.number_main)

        val inputText = findViewById<TextInputEditText>(R.id.textInput)
        val oddBt = findViewById<Button>(R.id.oddBt)
        val evenBt = findViewById<Button>(R.id.evenBt)
        val sqBt = findViewById<Button>(R.id.sqBt)
        val textView = findViewById<TextView>(R.id.textView)
        val listView = findViewById<ListView>(R.id.listView)

        var array: MutableList<Int> = mutableListOf()
        val arrayAdapter: ArrayAdapter<Int> = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            array
        )

        listView.run{
            adapter = arrayAdapter
        }

        oddBt.setOnClickListener{
            if (inputText.text!!.isEmpty()){
                textView.text = "Error"
            }
            else {
                textView.text = "Odd Number"
                val input = inputText.text.toString().toInt()
                array.clear()
                for (i in 1..input){
                    if (i % 2 == 1) {
                        array.add(i)
                    }
                }
                arrayAdapter.notifyDataSetChanged()
            }
        }
        evenBt.setOnClickListener{
            if (inputText.text!!.isEmpty()){
                textView.text = "Error"
            }
            else {
                textView.text = "Even Number"
                val input = inputText.text.toString().toInt()
                array.clear()
                for (i in 1..input){
                    if (i % 2 == 0)
                        array.add(i)
                }
                arrayAdapter.notifyDataSetChanged()
            }
        }
        sqBt.setOnClickListener{
            if (inputText.text!!.isEmpty()){
                textView.text = "Error"
            }
            else {
                textView.text = "Square Number"
                val input = inputText.text.toString().toInt()
                array.clear()
                for (i in 1..input){
                    if (sqrt(i.toDouble()) % 1.0 == 0.0)
                        array.add(i)
                }
                arrayAdapter.notifyDataSetChanged()
            }
        }
    }

}