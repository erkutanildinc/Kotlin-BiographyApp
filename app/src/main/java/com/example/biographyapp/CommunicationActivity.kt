package com.example.biographyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.biographyapp.databinding.ActivityCommunicationBinding
import com.example.biographyapp.databinding.ActivityMainBinding

class CommunicationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCommunicationBinding
    var linkedinIconUrl: String = "https://cdn-icons-png.flaticon.com/512/174/174857.png"
    var gmailIconUrl: String =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Gmail_icon_%282020%29.svg/2560px-Gmail_icon_%282020%29.svg.png"
    private lateinit var linkedinImage: ImageView
    private lateinit var gmailImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommunicationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        linkedinImage = binding.linkedinIcon
        gmailImage = binding.gmailIcon

        Glide.with(this).load(linkedinIconUrl).into(linkedinImage)
        Glide.with(this).load(gmailIconUrl).into(gmailImage)


    }
}