package com.example.pertemuan7

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.layout2.*


class layout3kot : AppCompatActivity() {
    private lateinit var button9:Button
    private lateinit var namaTv : TextView
    private lateinit var nimTv : TextView
    private lateinit var univTv : TextView
    private lateinit var jurTv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout3)

        namaTv = findViewById(R.id.tvNama)
        namaTv.setText(intent.getStringExtra("Nama"))

        nimTv = findViewById(R.id.tvNim)
        nimTv.setText(intent.getStringExtra("Nim"))

        univTv = findViewById(R.id.tvUniv)
        univTv.setText(intent.getStringExtra("Univ"))



        button9 = findViewById(R.id.btn_playMusic)
        button9.setOnClickListener{
            val intent = Intent(this, layout4kot::class.java)
            startActivity(intent)
        }
    }
}