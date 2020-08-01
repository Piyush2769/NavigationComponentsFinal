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

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** To enable the ActionBar to show a back button whenever a child fragment is attached to this Activity.*/

//    NavigationUI.setupActionBarWithNavController(this, navigationController)
//    (activity as AppCompatActivity).supportActionBar?.title = "Piyush Maheswari"

    /** Correctly handle up and back action */

//    override fun onSupportNavigateUp()   = navigationController.navigateUp()

}