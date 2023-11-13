package com.example.androidbundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var namaView: TextView
    private lateinit var umurView: TextView
    private lateinit var kelasView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        namaView = findViewById(R.id.namaView)
        umurView = findViewById(R.id.umurView)
        kelasView= findViewById(R.id.kelasView)

        val extras = intent.extras

        namaView.text = extras?.getString("nama")
        umurView.text = extras?.getString("umur")
        kelasView.text = extras?.getString("kelas")
    }
}