package com.example.test2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.test2.databinding.ActivityTest1Binding

class TestActivity1 : AppCompatActivity() {

    lateinit var bindingClass : ActivityTest1Binding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)


    }
    fun onClickGoTest2(view: View){

        val intent = Intent(this, TestActivity2::class.java)
        startActivity(intent)

    }
    fun onClickGoClose(view: View){

        finish()

    }
}
