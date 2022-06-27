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

    @ColumnInfo(name = "numJO")
    var numJO : Int? = null

    @ColumnInfo(name = "anneeJO")
    var anneeJO : String? = null

    @ColumnInfo(name = "datePubTJ")
    var datePubTJ : String? = null

    @ColumnInfo(name = "organe")
    var organe : String? = null

    @ColumnInfo(name = "numPage")
    var numPage : Int? = null

    @ColumnInfo(name = "typeTJ")
    var typeTJ : String? = null

    @ColumnInfo(name = "texteFR")
    var texteFR: String? = null

    @ColumnInfo(name = "isFav")
    var isFav : Int? = null

    @ColumnInfo(name = "noteFav")
    var noteFav : String? = null
}


