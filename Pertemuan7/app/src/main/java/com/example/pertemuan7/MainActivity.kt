package com.example.pertemuan7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout2.*

class MainActivity : AppCompatActivity() {
    private lateinit var  button:Button
    private lateinit var userName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName = findViewById(R.id.txt0)
        button = findViewById(R.id.btn_masuk)

        button.setOnClickListener{
            val intent = Intent(this, layout2kot::class.java)
            intent.putExtra("username", userName.text.toString())
            startActivity(intent)
        }
    }
}
