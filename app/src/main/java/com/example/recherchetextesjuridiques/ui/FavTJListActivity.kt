package com.example.recherchetextesjuridiques.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recherchetextesjuridiques.FavTJListAdapter
import com.example.recherchetextesjuridiques.R
import com.example.recherchetextesjuridiques.entities.TexteJuridique
import com.example.recherchetextesjuridiques.services.RoomService

class FavTJListActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var adapter: FavTJListAdapter
    lateinit var tj: MutableList<TexteJuridique>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tj_fav_home)

        val recyclerView = findViewById(R.id.fav_recycler_view) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        tj= RoomService.getDataBase(applicationContext).getTJDao().getFavTJ().toMutableList()
        //println("${tj}")

        adapter= FavTJListAdapter(tj, this)
        recyclerView.adapter = adapter
    }

    private fun showTJDetail(i: String) {
        val intent = Intent(this, TJDetailActivity::class.java)
        intent.putExtra("idTJ",i)
        startActivity(intent)

    }

    override fun onClick(v: View?) {
        if (v != null) {
            if (v.tag != null) {
                println("NOT NULL")
                showTJDetail(v.tag as String)
            }
        }
        else{
            println("NULL")
        }

    }
}