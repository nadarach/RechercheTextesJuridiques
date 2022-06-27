package com.example.recherchetextesjuridiques.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.TextView
import com.example.recherchetextesjuridiques.R
import com.example.recherchetextesjuridiques.entities.TexteJuridique
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TJDetailActivity : AppCompatActivity() {

    companion object {
        val REQUEST_EDIT_TJ = 1
        val EXTRA_TJ= "TJ"
        val EXTRA_TJ_INDEX = "idTJ"
        //val ACTION_FAV_Ayah= "com.example.quranreader.actions.action_favoris"

    }


    var tjid:Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tj_detail)

        var tjView = findViewById<TextView>(R.id.tj)
        var idTJView = findViewById<TextView>(R.id.idTJ)
        var numTJ = findViewById<TextView>(R.id.num_tj)
        var numJO = findViewById<TextView>(R.id.num_jo)

        var tj: TexteJuridique

        var id = intent.getStringExtra("idTJ")
        tjid = id?.toInt()

        var faveButton = findViewById<FloatingActionButton>(R.id.faves)
        faveButton.setOnClickListener{

        }
    }
}

