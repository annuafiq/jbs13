package com.example.androidbundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var namaEdit: EditText
    private lateinit var umurEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var submitBtn: Button

    private val NAME_KEY: String = "nama"
    private val AGE_KEY: String = "umur"
    private val CLASS_KEY: String = "kelas"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaEdit = findViewById(R.id.namaEdit)
        umurEdit = findViewById(R.id.umurEdit)
        kelasEdit = findViewById(R.id.kelasEdit)
        submitBtn = findViewById(R.id.submitBtn)

        submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(AGE_KEY, umurEdit.text.toString())
            intent.putExtra(CLASS_KEY, kelasEdit.text.toString())
            startActivity(intent)
        }
    }
}