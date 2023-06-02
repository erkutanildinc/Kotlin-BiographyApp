package com.example.biographyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import com.example.biographyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var communicationBtn: LinearLayout
    private lateinit var blogBtn: LinearLayout
    private lateinit var about_meBtn: LinearLayout
    private lateinit var projectsBtn: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        communicationBtn = binding.communicationLayout
        communicationBtn.setOnClickListener()
        {
            val commIntent = Intent(this, CommunicationActivity::class.java)
            startActivity(commIntent)
        }
        blogBtn = binding.blogLayout
        blogBtn.setOnClickListener()
        {
            val blogIntent = Intent(this, BlogActivity::class.java)
            startActivity(blogIntent)
        }
        about_meBtn = binding.aboutMeLayout
        about_meBtn.setOnClickListener()
        {
            val aboutMeIntent = Intent(this, Aboutme::class.java)
            startActivity(aboutMeIntent)
        }
        projectsBtn = binding.myProjectsLayout
        projectsBtn.setOnClickListener()
        {
            val myProjectsIntent = Intent(this, MyProjects::class.java)
            startActivity(myProjectsIntent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.closeApp -> {
                this.finishAffinity();
            }
        }
        return super.onOptionsItemSelected(item)
    }
}