package com.piyushmaheswari.navigationcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_nav_drawer.*

class DrawerMainActivity : AppCompatActivity() {

//    ToDo: Step 5
//    private lateinit var navController: NavController
//    private lateinit var drawerLayout: DrawerLayout
//    private lateinit var appBarConfiguration: AppBarConfiguration

//    ToDo: Step 10
//    private lateinit var listener: NavController.OnDestinationChangedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        ToDo: Step 1
//        setContentView(R.layout.activity_nav_drawer)

//        ToDo: Step 6
//        navController = findNavController(R.id.fragment)
//        drawerLayout = findViewById(R.id.drawer_layout)
//        navigation_view.setupWithNavController(navController)
//
//        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)
//        setupActionBarWithNavController(navController, appBarConfiguration)

//        ToDo: Step 7: Run App

//        ToDo: Step 11
//        listener =
//            NavController.OnDestinationChangedListener { controller, destination, arguments ->
//                if (destination.id == R.id.firstFragment) {
//                    supportActionBar?.title = "First Fragment"
//                } else if (destination.id == R.id.secondFragment) {
//                    supportActionBar?.title = "Second Fragment"
//                }
//            }

    }

//    ToDo: Step 13
//    override fun onPause() {
//        super.onPause()
//        navController.removeOnDestinationChangedListener(listener)
//
//    }

//    ToDo: Step 14
//    override fun onResume() {
//        super.onResume()
//        navController.addOnDestinationChangedListener(listener)
//    }

//    ToDo: Step 8
//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.fragment)
//        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
//    }

//    ToDo: Step 9: Run App

//    ToDo: Step 12: Run App
}