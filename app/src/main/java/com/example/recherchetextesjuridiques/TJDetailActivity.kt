package com.example.recherchetextesjuridiques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TJDetailActivity : AppCompatActivity() {

    companion object {
        val REQUEST_EDIT_TJ = 1
        val EXTRA_TJ= "TJ"
        val EXTRA_TJ_INDEX = "TJid"
        //val ACTION_FAV_Ayah= "com.example.quranreader.actions.action_favoris"

    }


    var tjid:Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tj_detail)
    }
}