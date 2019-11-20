package com.example.pertemuan7

import android.content.Intent
import android.os.Bundle
import android.service.voice.VoiceInteractionSession
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.DecorContentParent
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout2.*
import java.text.ParsePosition

class layout2kot : AppCompatActivity(){
    private lateinit var button: Button
    private lateinit var tvUserName: TextView
    private lateinit var nama : EditText
    private lateinit var nim : EditText
    private lateinit var Univ : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2)

        tvUserName = findViewById(R.id.txt9)
        tvUserName.setText(intent.getStringExtra("username"))

        nama = findViewById(R.id.txt1)
        nim = findViewById(R.id.txt2)
        Univ = findViewById(R.id.txt3)

        val jur = arrayOf("TI", "SI", "TK", "MI", "KA");
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, jur)

        spinner.adapter = arrayAdapter


        button=findViewById(R.id.btn_simpan)
        button.setOnClickListener{
            val intent = Intent(this, layout3kot::class.java)
            intent.putExtra("Nama", nama.text.toString())
            intent.putExtra("Nim", nim.text.toString())
            intent.putExtra("Univ", Univ.text.toString())
            startActivity(intent)
        }
    }
}