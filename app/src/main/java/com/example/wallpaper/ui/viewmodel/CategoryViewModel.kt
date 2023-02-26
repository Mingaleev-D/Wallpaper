package com.example.wallpaper.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.wallpaper.repository.MainRepository

/**
 * @author : Mingaleev D
 * @data : 26/02/2023
 */

class CategoryViewModel:ViewModel() {

   val repository = MainRepository()
}