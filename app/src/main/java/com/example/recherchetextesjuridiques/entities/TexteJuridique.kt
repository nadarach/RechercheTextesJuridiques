package com.example.recherchetextesjuridiques.entities;

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.Serializable
import java.lang.reflect.Type

@Entity(tableName="texte_juridique")
data class TexteJuridique (

    @PrimaryKey
    var id: Int? = null,

    @ColumnInfo(name="idTJ")
    var idTJ : Int? = null,

    @ColumnInfo(name = "idJO")
    var idJO : Int? = null,

    @ColumnInfo(name = "numJO")
    var numJO : Int? = null,

    @ColumnInfo(name = "anneeJO")
    var anneeJO : String? = null,

    @ColumnInfo(name = "datePubTJ")
    var datePubTJ : String? = null,

    @ColumnInfo(name = "organe")
    var organe : String? = null,

    @ColumnInfo(name = "numPage")
    var numPage : Int? = null,

    @ColumnInfo(name = "typeTJ")
    var typeTJ : String? = null,

    @ColumnInfo(name = "texteFR")
    var texteFR: String? = null,

    @ColumnInfo(name = "texteTJ")
    var texteTJ: String? = null,

    @ColumnInfo(name = "isFav")
    var isFav : Int? = null,

    @ColumnInfo(name = "noteFav")
    var noteFav : String? = null,
)


class TypeConverterTJ {
    private val gson: Gson = Gson()

    @TypeConverter
    fun stringToSomeObjectList(data: String?): TexteJuridique? {
        if (data == null) return null
        val listType: Type = object : TypeToken<TexteJuridique?>() {}.type
        return gson.fromJson<TexteJuridique?>(data, listType)
    }

    @TypeConverter
    fun someObjectListToString(someObject: TexteJuridique?): String? {
        return gson.toJson(someObject)
    }
}


