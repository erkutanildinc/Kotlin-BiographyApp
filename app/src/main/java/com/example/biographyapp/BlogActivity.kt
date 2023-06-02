package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.biographyapp.databinding.ActivityBlogBinding
import com.example.biographyapp.databinding.ActivityMainBinding

class BlogActivity : AppCompatActivity() {

    lateinit var blogWebView: WebView
    private lateinit var binding: ActivityBlogBinding
    private val linkedinProfileURL = "https://github.com/anilerkut"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlogBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        blogWebView = binding.linkedinProfileWebView
        blogWebView.loadUrl(linkedinProfileURL)
    }
}