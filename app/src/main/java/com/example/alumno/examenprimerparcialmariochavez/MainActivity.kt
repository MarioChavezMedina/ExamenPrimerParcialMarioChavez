package com.example.alumno.examenprimerparcialmariochavez

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun valida(view: View){
        var a:EditText= findViewById<EditText>(R.id.c)
        var b:EditText= findViewById<EditText>(R.id.cc)
        Log.d("aaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaa")
        if(a.text.toString() == "lalo" && b.text.toString() == "lalo"){
            startActivity(Intent(this, MenusPerroActivity::class.java))
        }else{
            Toast.makeText(this,"aaaaaaaaaaaaaaaaaaa",Toast.LENGTH_SHORT)
        }
    }
}
