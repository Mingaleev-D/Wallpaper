package com.example.wallpaper.data.apiservice

import com.example.wallpaper.BuildConfig
import com.example.wallpaper.data.model.collections.CollectionsList
import com.example.wallpaper.data.model.photo.WallpaperList
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author : Mingaleev D
 * @data : 26/02/2023
 */

interface WallpaperService {

   //all
   @GET("photos")
   suspend fun fetchHomeFromApi(
       @Query("client_id") client:String = BuildConfig.API_KEY
   ): WallpaperList

   @GET("photos")
   suspend fun fetchPopularFromApi(
       @Query("order_by") orderBy:String = "popular",
       @Query("client_id") client:String = BuildConfig.API_KEY
   ): WallpaperList

   @GET("photos/?random")
   suspend fun fetchRandomFromApi(
       @Query("client_id") client:String = BuildConfig.API_KEY
   ): WallpaperList

   @GET("collections")
   suspend fun fetchCategoriesFromApi(
       @Query("client_id") client:String = BuildConfig.API_KEY
   ): CollectionsList
}