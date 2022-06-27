package com.example.recherchetextesjuridiques.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.recherchetextesjuridiques.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOne= findViewById<Button>(R.id.button2)
        val buttonTwo= findViewById<Button>(R.id.button3)

        buttonOne.setOnClickListener {
            val intent = Intent(this, TJListActivity::class.java)

            startActivity(intent)
        }

        buttonTwo.setOnClickListener {
            val intent = Intent(this, FavTJListActivity::class.java)

            startActivity(intent)
        }
    }
}