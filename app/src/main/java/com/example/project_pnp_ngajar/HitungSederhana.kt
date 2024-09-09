package com.example.project_pnp_ngajar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HitungSederhana : AppCompatActivity() {

    private lateinit var btnTambah : Button
    private lateinit var btnKali : Button
    private lateinit var btnKurang : Button
    private lateinit var etAngka1 : EditText
    private lateinit var etAngka2 : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hitung_sederhana)

        btnTambah = findViewById(R.id.btnTambah)
        btnKurang = findViewById(R.id.btnKurang)
        btnKali = findViewById(R.id.btnKali)
        etAngka1 = findViewById(R.id.etAngka1)
        etAngka2 = findViewById(R.id.etAngka2)

        btnTambah.setOnClickListener(){
            val tambah = etAngka1.text.toString().toInt() + etAngka2.text.toString().toInt()
        }

        btnKali.setOnClickListener(){
            val tambah = etAngka1.text.toString().toInt() * etAngka2.text.toString().toInt()
        }

        btnKurang.setOnClickListener(){
            val tambah = etAngka1.text.toString().toInt() - etAngka2.text.toString().toInt()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}