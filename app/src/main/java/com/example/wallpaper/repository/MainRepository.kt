package com.example.wallpaper.repository

import com.example.wallpaper.data.apiservice.RetrofitApi
import com.example.wallpaper.data.apiservice.WallpaperService

/**
 * @author : Mingaleev D
 * @data : 26/02/2023
 */

class MainRepository {

   fun retroService(): WallpaperService = RetrofitApi.api
}