package com.example.bottomnavigationdrawerjetpack.example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationdrawerjetpack.R
import com.example.bottomnavigationdrawerjetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var navController:NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // for bottombar
        navController = findNavController(R.id.hostFragment)
        binding.bottomNavigation.setupWithNavController(navController)


        //navigation up button  to show the back arrow
        appBarConfiguration = AppBarConfiguration(navController.graph , binding.drawerLayout)
        NavigationUI.setupActionBarWithNavController(this , navController , binding.drawerLayout)


        //Drawer layout
        NavigationUI.setupWithNavController(binding.navigationView , navController)




        binding.btnGotoNews.setOnClickListener {
            val item = binding.bottomNavigation.menu.findItem(R.id.newsFragment)
            NavigationUI.onNavDestinationSelected(item, navController)
        }





    }

    // to action of arrow back
    override fun onSupportNavigateUp(): Boolean {
       return NavigationUI.navigateUp(navController , appBarConfiguration)
    }




//    override fun onResume() {
//        super.onResume()
//        controller.addOnDestinationChangedListener(listener)
//    }
//
//    override fun onPause() {
//        controller.removeOnDestinationChangedListener(listener)
//        super.onPause()
//    }


}