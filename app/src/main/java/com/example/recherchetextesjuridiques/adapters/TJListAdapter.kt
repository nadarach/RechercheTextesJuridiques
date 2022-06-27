package com.example.recherchetextesjuridiques.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recherchetextesjuridiques.R
import com.example.recherchetextesjuridiques.entities.TexteJuridique

class TJListAdapter(val jos: List<TexteJuridique>, val itemClickListener: View.OnClickListener)
    : RecyclerView.Adapter<TJListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById(R.id.card_view) as CardView
        val tjView = cardView.findViewById(R.id.jo) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.jo_item, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val jo = jos[position]
        holder.cardView.setOnClickListener(itemClickListener)
        holder.cardView.tag = jo.numJO
        holder.tjView.text = jo.texteFR

    }

    override fun getItemCount(): Int {
        return jos.size
    }
}