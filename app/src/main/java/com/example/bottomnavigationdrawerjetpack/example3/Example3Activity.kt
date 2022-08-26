package com.example.bottomnavigationdrawerjetpack.example3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.bottomnavigationdrawerjetpack.R
import com.example.bottomnavigationdrawerjetpack.databinding.ActivityExample3Binding

class Example3Activity : AppCompatActivity() {

    lateinit var binding: ActivityExample3Binding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExample3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        navController = findNavController(R.id.hostFragment3)



        binding.btnX.setOnClickListener {
            navController.navigateUp() // to clear previous navigation history
            navController.navigate(R.id.fragmentX)
        }

        binding.btnY.setOnClickListener {
            navController.navigateUp() // to clear previous navigation history
            navController.navigate(R.id.fragmentY)
        }

        binding.btnZ.setOnClickListener {
            navController.navigateUp() // to clear previous navigation history
            navController.navigate(R.id.fragmentZ)
        }
    }
}