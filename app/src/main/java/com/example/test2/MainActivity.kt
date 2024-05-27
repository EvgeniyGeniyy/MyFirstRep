package com.example.test2

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.test2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var tv : TextView
    lateinit var bt : Button


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tvTest)
        bt = findViewById(R.id.buttonTest)
        bt.setOnClickListener {
            tv.text = "It is Work!"
        }
    }

    fun onClickTest(view: View){



    }

}