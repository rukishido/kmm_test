package com.example.kmm_t.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kmm_t.androidApp.databinding.ActivityMainBinding
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {
    lateinit var binder:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)
    }
}
