package com.example.aula07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula07.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoVoltarNome.setOnClickListener(){
            val nome = binding.nome.text.toString()
            val respIntent = intent

            respIntent.putExtra("nome", nome)
            setResult(RESULT_OK, respIntent)

            //finaliza a atividade atual
            finish()
        }
    }
}