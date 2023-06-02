package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.biographyapp.adapter.ProjectCustomAdapter
import com.example.biographyapp.databinding.ActivityMainBinding
import com.example.biographyapp.databinding.ActivityMyProjectsBinding
import com.example.biographyapp.service.ProjectModelService

class MyProjects : AppCompatActivity() {

    lateinit var listView: ListView
    val projectService = ProjectModelService()
    private lateinit var binding: ActivityMyProjectsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyProjectsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        listView = binding.myProjectsListView
        val customAdapter = ProjectCustomAdapter(this, projectService.projectResult())
        listView.adapter = customAdapter

    }
}