package com.example.recherchetextesjuridiques.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recherchetextesjuridiques.R
import com.example.recherchetextesjuridiques.adapters.TJListAdapter
import com.example.recherchetextesjuridiques.services.RoomService
import com.example.recherchetextesjuridiques.entities.TexteJuridique

class TJListActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var adapter: TJListAdapter
    lateinit var jo: MutableList<TexteJuridique>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tj_home)

        val recyclerView = findViewById(R.id.recycler_view) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        jo = RoomService.getDataBase(applicationContext).getTJDao().getSUniqueRacine()
            .toMutableList()
        println(" something here ${jo}")

        adapter = TJListAdapter(jo, this)
        recyclerView.adapter = adapter
    }

    private fun showTJ(i: Int) {
        val intent = Intent(this, TJListOfJOActivity::class.java)
        intent.putExtra("numJO",i)
        startActivity(intent)

    }

    override fun onClick(v: View?) {

        if (v != null) {
            if (v.tag != null) {
                println("NOT NULL")
                showTJ(v.tag as Int)
                println("NOT NULL (besah dkhelt l JO)")
            }
        }
        else{
            println("NULL")
        }

    }
}