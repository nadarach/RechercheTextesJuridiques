package com.example.recherchetextesjuridiques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recherchetextesjuridiques.database.RoomService
import com.example.recherchetextesjuridiques.entities.TexteJuridique

class TJListActivity : AppCompatActivity() {

    lateinit var adapter: TJListAdapter
    lateinit var tj: MutableList<TexteJuridique>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tj_home)

        val recyclerView = findViewById(R.id.recycler_view) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        tj= RoomService.getDataBase(applicationContext).getTJDao().getSUniqueRacine().toMutableList()
        println(" something here ${tj}")

        //adapter= TJListAdapter(tj, this)
        //recyclerView.adapter = adapter
    }
}