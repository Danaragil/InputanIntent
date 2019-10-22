package com.example.inputanintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity_kedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        var intent = intent
        val nim = intent.getStringExtra("NIM")
        val nama = intent.getStringExtra("Nama")
        var nilai = intent.getStringExtra("Nilai")

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "NIM : "+nim+"\nNama: "+nama+"\nNilai: "+nilai

        val keterangan = findViewById<TextView>(R.id.keterangan)
        val nilaiInt = nilai.toInt()
        if (nilaiInt >= 80 || nilaiInt == 100) {
            keterangan.text = "Keterangan : A"
        }
        else if (nilaiInt >= 60) {
            keterangan.text = "Keterangan : B"
        }
        else if (nilaiInt >= 40) {
            keterangan.text = "Keterangan : C"
        }
        else if (nilaiInt >= 20) {
            keterangan.text = "Keterangan : D"
        }
        else if (nilaiInt >= 0) {
            keterangan.text = "Keterangan : E"
        }
    }
}
