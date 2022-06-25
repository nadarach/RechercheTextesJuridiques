package com.example.recherchetextesjuridiques.entities;

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName="texte_juridique")
class TexteJuridique : Serializable {

    @PrimaryKey
    var id: Int? = null

    @ColumnInfo(name="idTJ")
    var idTJ : Int? = null

    @ColumnInfo(name = "idJO")
    var idJO : Int? = null

    var numJO : Int? = null

    var isFav : Int? = null

    var noteFav : String? = null
}


