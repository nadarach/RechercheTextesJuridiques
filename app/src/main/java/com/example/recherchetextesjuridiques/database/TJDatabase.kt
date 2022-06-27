package com.example.recherchetextesjuridiques.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.recherchetextesjuridiques.dao.TJDao
import com.example.recherchetextesjuridiques.entities.TexteJuridique

@Database(entities = [TexteJuridique::class], version = 1, exportSchema = false)
abstract class TJDatabase : RoomDatabase() {

    companion object {
        var tjDatabase: TJDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): TJDatabase {
            if (tjDatabase == null) {
                tjDatabase = Room.databaseBuilder(
                    context
                    , TJDatabase::class.java
                    , "tj.db"
                ).build()
            }
            return tjDatabase!!
        }
    }

    abstract fun getTJDao(): TJDao

}