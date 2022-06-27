package com.example.recherchetextesjuridiques

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recherchetextesjuridiques.entities.TexteJuridique

class TJListAdapter(val tjs: List<TexteJuridique>, val itemClickListener: View.OnClickListener)
    : RecyclerView.Adapter<TJListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView = itemView.findViewById(R.id.card_view) as CardView
        val tjView = cardView.findViewById(R.id.tj) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.tj_item, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tj = tjs[position]
        holder.cardView.setOnClickListener(itemClickListener)
        holder.cardView.tag = tj.idJO
        holder.tjView.text = tj.texteFR

    }

    override fun getItemCount(): Int {
        return tjs.size
    }
}