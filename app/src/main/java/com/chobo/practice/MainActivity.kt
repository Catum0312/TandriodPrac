package com.chobo.practice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tv: TextView =findViewById(R.id.tv_hello)
        val btn: Button =findViewById(R.id.btn_kor)
        btn.setOnClickListener{
            tv.text="안녕"
        }
        }
    }
}