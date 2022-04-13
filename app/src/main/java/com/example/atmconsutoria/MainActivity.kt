package com.example.atmconsutoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton_clientes.setOnClickListener {
            val intent = Intent(this, DetalhesClienteActivity::class.java)
            startActivity(intent)
        }

        imageButton_empresa.setOnClickListener {
            val intent = Intent(this, DetalhesEmpresaActivity::class.java)
            startActivity(intent)
        }

        imageButton_servicos.setOnClickListener {
            val intent = Intent(this, DetalhesServicosActivity::class.java)
            startActivity(intent)
        }

        imageButton_contato.setOnClickListener {
            val intent = Intent(this, DetalhesContatoActivity::class.java)
            startActivity(intent)
        }
        fi
    }
}