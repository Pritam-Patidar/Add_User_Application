package com.example.adduserapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addUserFragment = UserFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, addUserFragment).commit()

    }
}


