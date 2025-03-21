package com.example.tugas2

import android.os.Bundle
import android.content.Intent
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas2.databinding.HomeBinding


class home : AppCompatActivity() {

    private lateinit var binding: HomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        binding = HomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val Intentmasuk = Intent(this, masuk::class.java)
            startActivity(Intentmasuk)
        }
        binding.textView9.setOnClickListener {
            val intentGaleri = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivity(intentGaleri)
        }


    }
}

