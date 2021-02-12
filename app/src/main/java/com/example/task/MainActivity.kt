package com.example.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    lateinit var drawlayout: DrawerLayout
    lateinit var navigationView: NavigationView;
    lateinit var toolbar: Toolbar;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navigation:BottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        drawlayout=findViewById(R.id.drawer)
        navigationView=findViewById(R.id.nav_view)

        toolbar=findViewById(R.id.toolbar)
        navigationView.bringToFront()
        toolbar.setNavigationOnClickListener{
            drawlayout.openDrawer(GravityCompat.START);
        }

            navigation.setOnNavigationItemSelectedListener(this)
        loadFragment(HomeFragment())

    }
    private fun loadFragment(fragment: Fragment?): Boolean {

        if (fragment != null) {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragConatiner, fragment)
                    .commit()
            return true
        }
        return false
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment: Fragment? = null

        when (item.itemId) {
            R.id.home -> fragment = HomeFragment()
            R.id.feedback -> fragment = FeedbackFragment()
            R.id.plus -> fragment = AddFragment()
            R.id.chats -> fragment = ChatFragment()
            R.id.profile -> fragment = ProfileFragment()
        }

        return loadFragment(fragment)

    }
}