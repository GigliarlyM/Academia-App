package br.com.academiaapp.ui

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import br.com.academiaapp.R
import br.com.academiaapp.databinding.ActivityTreinoMetaDietaBinding

class TreinoMetaDietaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTreinoMetaDietaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTreinoMetaDietaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        val navView: BottomNavigationView = binding.bottomNavigation

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_treino_meta_dieta) as NavHostFragment
        val navController = navHostFragment.navController

//        val navController = findNavController(R.id.nav_host_fragment_activity_treino_meta_dieta)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )

        navView.setupWithNavController(navController)
    }

}