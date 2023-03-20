package com.example.mediaplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mediaplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val mediaPlayer = MediaPlayer.create(applicationContext, R.raw.audio)


        binding.buttonEscutar.setOnClickListener {
            mediaPlayer.start();


        }
        binding.buttonParar.setOnClickListener {
            if(mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            }
            }
        }

    }
