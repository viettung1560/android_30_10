package com.example.android_30_10_2024

import android.os.Bundle
import android.widget.ListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_main)


        val students = mutableListOf<StudentModel>(
            StudentModel("tung", "01"),
            StudentModel("dat", "02"),
            StudentModel("anh", "03"),
            StudentModel("toan", "04"),
            StudentModel("ng", "05"),
            StudentModel("a", "06"),
            StudentModel("viet", "07"),
            StudentModel("hung", "08"),
            StudentModel("rrt", "09"),
            StudentModel("asdasd", "10"),
            StudentModel("asdasd", "11"),
        )

        students.add(
            StudentModel(
                "asdasd", "01"
            )
        )

        val adapter = StudentAdapter(students)

        val listStudents = findViewById<ListView>(R.id.listViewStudent)
        listStudents.adapter = adapter

        val searchView = findViewById<SearchView>(R.id.searchView)

    }
}