package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener {

            if (etName.text.isEmpty()){
                Toast.makeText(this,
                    "Please enter your name", Toast.LENGTH_LONG).show()
            } else {
                // esse trecho do código permite que passemos da página inicial para a
                // próxima e não conseguimos voltar, a não ser que ela seja inicializada
                // novamente
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}