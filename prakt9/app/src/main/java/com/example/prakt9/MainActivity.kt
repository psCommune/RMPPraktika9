package com.example.prakt9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var editHeight: EditText
    private lateinit var editWeight: EditText
    private lateinit var stw: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        editHeight = findViewById(R.id.editTextHeight)
        editWeight = findViewById(R.id.editTextWeight)
        btn.setOnClickListener {
            if(editHeight.text.toString()!=""&&editWeight.text.toString()!=""){
                val a:String = editHeight.text.toString()
                val b:String = editWeight.text.toString()
                val res:Float = b.toFloat()/ a.toFloat()
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("data",res.toFloat())
                startActivity(intent)
            }
            else {
                Toast.makeText(this,"Не все поля заполнены",Toast.LENGTH_SHORT).show()
            }
        }
    }
}