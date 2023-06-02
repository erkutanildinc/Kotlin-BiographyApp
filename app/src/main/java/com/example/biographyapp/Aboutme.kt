package com.example.biographyapp

import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.biographyapp.databinding.ActivityAboutmeBinding
import com.example.biographyapp.databinding.ActivityMainBinding

class Aboutme : AppCompatActivity() {

    private lateinit var binding: ActivityAboutmeBinding
    private lateinit var catImageWithGlide: ImageView
    private val url: String = "https://r.resimlink.com/8kG_c3ZLQU.jpeg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutmeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        catImageWithGlide = binding.glideMyCat


        Glide.with(this).load(url).into(catImageWithGlide)
    }
}