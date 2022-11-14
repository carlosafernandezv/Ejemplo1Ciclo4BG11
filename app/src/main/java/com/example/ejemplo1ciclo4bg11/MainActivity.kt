package com.example.ejemplo1ciclo4bg11


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private var edtUsername: EditText?=null
    private var edtPassword: TextInputEditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)
    }

    fun onLogin(botonlogin: View)
    {
        val messagepassword=getString(R.string.messagepassword)
        val messageusername=getString(R.string.messageusername)
        var username : String=edtUsername!!.text.toString()
        if (username=="luis@correo.co") {
            if (edtPassword!!.text.toString()=="12345")
            {
                val intent = Intent(this,WelcomeActivity::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this,messagepassword,Toast.LENGTH_LONG).show()
            }
        }
        else
        {
            Toast.makeText(this,messageusername,Toast.LENGTH_LONG).show()
        }
    }

    fun onLogin2(view: View) {
        val intent = Intent(this,WelcomeActivity::class.java)
        startActivity(intent)
    }
}