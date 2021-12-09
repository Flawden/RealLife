package ru.kaxop.reallife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class GameActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        bottomNav = findViewById(R.id.bottom_nav_menu)

        bottomNav.setOnItemSelectedListener { item ->

            var fragment: Fragment? = null

            when(item.itemId) {
                R.id.status -> {
                    fragment = statusFragment()
                    replaceFragment(fragment)
                }
                R.id.job -> {
                    fragment = JobFragment()
                }
                R.id.education -> {
                    fragment = educationFragment()
                }
                R.id.joy -> {
                    fragment = JoyFragment()
                }
                R.id.health -> {
                    fragment = HealthFragment()
                }
            }
            replaceFragment(fragment!!)

            true
        }


        bottomNav.selectedItemId = R.id.status

    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}