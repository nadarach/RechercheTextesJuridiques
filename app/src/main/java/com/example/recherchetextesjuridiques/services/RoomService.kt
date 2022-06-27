package com.example.recherchetextesjuridiques.services

import android.annotation.SuppressLint
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.recherchetextesjuridiques.database.TJDatabase
import java.util.concurrent.Executors

@SuppressLint("StaticFieldLeak")
object RoomService {
    lateinit var context: Context
    private var dataBase : TJDatabase? =null;
    fun getDataBase (context: Context): TJDatabase {
        if (dataBase ==null){ dataBase  = Room.databaseBuilder(context, TJDatabase::class.java,"quran_database")
            .allowMainThreadQueries()
            .addCallback(object : RoomDatabase.Callback(){
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    Executors.newSingleThreadExecutor().execute{

                        //dataBase?.getTJDao()?.insertAll(LoadData.getAllDatabase(context))
                    }
                }

            })
            .build()
        }

        return dataBase!!


    }


}