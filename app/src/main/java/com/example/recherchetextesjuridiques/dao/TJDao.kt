package com.example.recherchetextesjuridiques.dao

import androidx.room.*
import androidx.room.Query
import com.example.recherchetextesjuridiques.entities.TexteJuridique

@Dao
interface TJDao {

    @Query("Select * FROM texte_juridique where idTJ=id")
    fun getTJById(idTJ:Int?):TexteJuridique

    @Query("Select * from texte_juridique")
    fun getAllTJ():List<TexteJuridique>

    @Update
    fun updateFavTJ(TJ : TexteJuridique)

    @Query("Select * from texte_juridique where isFav==1")
    fun getFavTJ() : List<TexteJuridique>

    @Update
    fun deleteTJByIdFav(TJ : TexteJuridique)
}