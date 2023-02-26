package com.example.wallpaper.data.apiservice

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitApi {

   const val BASE_URL = "https://api.unsplash.com/"

   private val retrofitClient by lazy {
      val loggingInterceptor = HttpLoggingInterceptor()
      loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
      val client = OkHttpClient.Builder()
         .addInterceptor(loggingInterceptor)
         .build()
      Retrofit.Builder()
         .baseUrl(BASE_URL)
         .client(client)
         .addConverterFactory(GsonConverterFactory.create())
         .build()
   }

   val api by lazy {
      retrofitClient.create(WallpaperService::class.java)
   }

}