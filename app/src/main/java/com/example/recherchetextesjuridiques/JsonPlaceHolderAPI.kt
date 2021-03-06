package com.example.recherchetextesjuridiques

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface JsonPlaceHolderAPI {
    @GET("/v4/textes/by_key/{NumSGG}?fields=NumJO")
    fun getTJ(@Path("numSGG") numSGG:String?):Call<JsonObject>
}