package com.example.ka_lesson14

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TestActivity2:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_test_2)
    }

    fun onClickClose(view: View) {
        finish()
    }
}