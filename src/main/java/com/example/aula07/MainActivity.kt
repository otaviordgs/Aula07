package com.example.aula07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.aula07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.botaoIr.setOnClickListener(){
            val intent = Intent(this, Activity2::class.java)
            startActivityForResult(intent, 1)
        }
    }

    //funcao chamada quando uma resposta é enviada
    //Intent? -> pode ser null
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == 1){
            data?.let {
                //se for null, oq tá na frente não é executado
                val nome = it.getStringExtra("nome")
                binding.botaoIr.text = nome
            }
        }


    }
}