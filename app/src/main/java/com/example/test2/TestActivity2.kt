package com.example.test2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.test2.databinding.ActivityTest1Binding
import com.example.test2.databinding.LayoutTest2Binding

class TestActivity2 : AppCompatActivity () {
    lateinit var bindingClass : LayoutTest2Binding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.layout_test2)

        fun onClickGoClose(view: View){

            finish()

        }
    }
}