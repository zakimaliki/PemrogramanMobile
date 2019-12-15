package com.example.candi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class NextActivity : AppCompatActivity() {
    var name : EditText?=null
    var pass : EditText?=null
    var mdb : DatabaseHelper?=null
    var simpan : Button?=null
    var login : Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        name = findViewById(R.id.uname) as EditText
        pass = findViewById(R.id.pass) as EditText
        simpan = findViewById(R.id.btnLogin) as Button
        login = findViewById(R.id.btnRegister) as Button
        mdb = DatabaseHelper(this)

        simpan!!.setOnClickListener{
            fillData()
        }
        login!!.setOnClickListener{
            startActivity(Intent(this@NextActivity,FormLogin::class.java))
        }
    }

    private fun fillData(){
        val nama = name!!.text.toString()
        val pas = pass!!.text.toString()
        val data = mdb!!.getUser(nama, pas)
        data.moveToFirst()
        if (data.count>0){
            data.moveToPosition(0)
            val baca=data.getString(0).toString()
            showToast("username= $baca")
            val ambil=data.getString(1).toString()
            showToast("password= $ambil")
            startActivity(Intent(this@NextActivity,MainActivity::class.java))
        }
        else{
            showToast("Username atau Password salah")
        }
    }
    private fun showToast(text: String){
        Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
    }

}
