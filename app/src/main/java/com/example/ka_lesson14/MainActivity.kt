package com.example.ka_lesson14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ka_lesson14.constance.Constance
import com.example.ka_lesson14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key")
        bindingClass.tvMessageMain.text = message
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 100 && resultCode == RESULT_OK && data != null) {
            bindingClass.tvMessageMain.text = data.getStringExtra("key2")

        }
    }

    fun onClickTest1(view:View) {
        val i = Intent(this, TestActivity1::class.java)
        i.putExtra("key", "как тебя зовут?")
        startActivityForResult(i, 100)
    }

}