package com.example.candi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormLogin : AppCompatActivity() {
    var name : EditText?=null
    var pass : EditText?=null
    var mdb : DatabaseHelper?=null
    var simpan : Button?=null
    var login : Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)
        name = findViewById(R.id.uname) as EditText
        pass = findViewById(R.id.pass) as EditText
        simpan = findViewById(R.id.btnLogin) as Button
        login = findViewById(R.id.btnSecond) as Button
        mdb = DatabaseHelper(this)

        simpan!!.setOnClickListener{
            fillData()
        }
        login!!.setOnClickListener{
            startActivity(Intent(this@FormLogin,NextActivity::class.java))
        }
    }

    private fun fillData(){
        val nama = name!!.text.toString()
        val pas = pass!!.text.toString()
        val data = mdb!!.insertUser(nama, pas)
        if(data){
            showToast("data berhasil diinputkan")
        }else{
            showToast("data gagal diinputkan")
        }
    }
    private fun showToast(text: String){
        Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
    }

}
