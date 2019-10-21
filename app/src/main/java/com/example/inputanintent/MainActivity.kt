package com.example.inputanintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nim = findViewById<EditText>(R.id.nim)
        val nama = findViewById<EditText>(R.id.nama)
        val nilai = findViewById<EditText>(R.id.nilai)
        val inputbtn = findViewById<Button>(R.id.inputbtn)

        inputbtn.setOnClickListener {
            val nim = nim.text.toString()
            val nama= nama.text.toString()
            val nilai = nilai.text.toString()

            val intent = Intent(this@MainActivity, activity_kedua::class.java)
            intent.putExtra("NIM", nim)
            intent.putExtra("Nama", nama)
            intent.putExtra("Nilai", nilai)
            startActivity(intent)

        }
    }
}
