package com.example.app6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app6.Classes.Movie

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
    }

    fun test()
    {
        val t = Movie("sdf")
    }

}