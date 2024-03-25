package br.com.academiaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.academiaapp.databinding.ActivityMainBinding
import br.com.academiaapp.ui.TreinoMetaDietaActivity

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.goTreino.setOnClickListener {
            Log.i("msg", "Clicou em treino")
            val intent = Intent(this, TreinoMetaDietaActivity::class.java)
            startActivity(intent)
        }

        binding.goDieta.setOnClickListener {
            Log.i("msg", "Clicou em Dieta")
            val intent = Intent(this, TreinoMetaDietaActivity::class.java)
            startActivity(intent)
        }

        binding.goMeta.setOnClickListener {
            Log.i("msg", "Clicou em Meta")
            val intent = Intent(this, TreinoMetaDietaActivity::class.java)
            startActivity(intent)
        }
    }
}