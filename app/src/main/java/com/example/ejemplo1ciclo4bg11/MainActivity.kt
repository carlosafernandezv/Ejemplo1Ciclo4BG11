package com.example.ejemplo1ciclo4bg11

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private var edtUsername: EditText?=null
    private var edtPassword: TextInputEditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)
    }

    fun onLogin(botonlogin: View)
    {
        val messagepassword=getString(R.string.messagepassword)
        val messageusername=getString(R.string.messageusername)
        var username : String=edtUsername!!.text.toString()
        if (username=="luis@correo.co")
        {
            if (edtPassword!!.text.toString()=="12345")
            {
                val NegativeButton={_:DialogInterface,_:Int->}
                val positiveButton={dialog:DialogInterface,which:Int->
                    val intent = Intent(this,WelcomeActivity::class.java)
                    startActivity(intent)
                }

                val dialog=AlertDialog.Builder(this)
                    .setTitle("Welcome")
                    .setMessage("User: "+username)
                    .setPositiveButton("ok",positiveButton)
                    .setNegativeButton("Cancelar",NegativeButton)
                    .create()
                    .show()
            }
            else
            {
                val dialog=AlertDialog.Builder(this)
                    .setTitle("ERROR")
                    .setMessage(messagepassword)
                    .create()
                    .show()
            }
        }
        else
        {
            /*
            val dialog=AlertDialog.Builder(this)
                .setTitle("ERROR")
                .setMessage(messageusername)
                .create()
                .show()
             */
            Toast.makeText(this,messageusername,Toast.LENGTH_LONG).show()
        }
    }
}