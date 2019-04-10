package com.ricardo.interfaces.activities

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.ricardo.interfaces.R
import kotlinx.android.synthetic.main.app_bar_main.*

class ChicaLayout : AppCompatActivity() {

    private val mDrawerLayout: DrawerLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chica_layout)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_options, menu)
        return super.onCreateOptionsMenu(menu)
    }

}
