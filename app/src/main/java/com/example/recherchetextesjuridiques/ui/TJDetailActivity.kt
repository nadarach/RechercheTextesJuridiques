package com.example.recherchetextesjuridiques.ui

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.telephony.SmsManager
import android.util.Log
import android.view.Window
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.example.recherchetextesjuridiques.R
import com.example.recherchetextesjuridiques.entities.TexteJuridique
import com.example.recherchetextesjuridiques.services.RoomService
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TJDetailActivity : AppCompatActivity() {

    companion object {
        val REQUEST_EDIT_TJ = 1
        val EXTRA_TJ = "TJ"
        val EXTRA_TJ_INDEX = "idTJ"
        //val ACTION_FAV_Ayah= "com.example.quranreader.actions.action_favoris"

    }


    var tjid: Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tj_detail)

        var tjView = findViewById<TextView>(R.id.tj)
        var idTJView = findViewById<TextView>(R.id.idTJ)
        var numTJ = findViewById<TextView>(R.id.num_tj)
        var numJO = findViewById<TextView>(R.id.num_jo)


        var id = intent.getStringExtra("idTJ")
        tjid = id?.toInt()

        var faveButton = findViewById<FloatingActionButton>(R.id.faves)
        faveButton.setOnClickListener {
            var tj = TexteJuridique()
            tj.idTJ = idTJView.toString()
            tj.numJO = numJO.toString()
            tj.isFav = 1
            RoomService.getDataBase(applicationContext).getTJDao().insertFavTJ(tj)
        }

        var shareButton = findViewById<FloatingActionButton>(R.id.share)
        shareButton.setOnClickListener {
            val contacts = contentResolver.query(
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                null,
                null,
                null,
                null,
                null
            )
            if (contacts != null) {
                while (contacts.moveToNext()) {
                    var obj = SmsManager.getDefault()
                    /*obj.sendTextMessage(
                        contacts.getString(contacts.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)),
                        null,
                        "test",
                        null,
                        null
                    )*/
                    //println("${contacts.getString(contacts.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))}")
                }
            }
        }
    }

}

