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
        if (nilai >= 80.toInt().toString() || nilai == 100.toInt().toString()) {
            keterangan.text = "Keterangan : A"
        }
        else if (nilai >= 60.toInt().toString()) {
            keterangan.text = "Keterangan : B"
        }
        else if (nilai >= 40.toInt().toString()) {
            keterangan.text = "Keterangan : C"
        }
        else if (nilai >= 20.toInt().toString()) {
            keterangan.text = "Keterangan : D"
        }
        else if (nilai >= 0.toInt().toString()) {
            keterangan.text = "Keterangan : E"
        }
    }
}
