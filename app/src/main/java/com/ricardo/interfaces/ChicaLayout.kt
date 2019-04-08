package com.ricardo.interfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.activity_chica_layout.*

class ChicaLayout : AppCompatActivity() {

    private val mDrawerLayout: DrawerLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chica_layout)

        floatingActionButton.setOnClickListener{ view ->
            //val intent = Intent (this, MisComponentes::class.java)
            //startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_options, menu)
        return super.onCreateOptionsMenu(menu)
    }

}
