package com.debz.itachixx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.debz.itachixx.databinding.ActivityMainBinding
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count=0
        binding.btnCount.setOnClickListener(){
            count++
            binding.txt1.text="Lets Count Together: $count"
        }


    }
}