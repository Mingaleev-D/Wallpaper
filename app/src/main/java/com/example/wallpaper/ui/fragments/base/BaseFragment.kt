package com.example.wallpaper.ui.fragments.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

/**
 * @author : Mingaleev D
 * @data : 26/02/2023
 */

abstract class BaseFragment<VB : ViewBinding>(
    private val layoutInflater: (inflater: LayoutInflater) -> VB
) : Fragment() {

   private var _binding: VB? = null
   val binding: VB
      get() = _binding as VB

   override fun onCreateView(
       inflater: LayoutInflater,
       container: ViewGroup?,
       savedInstanceState: Bundle?
   ): View? {

      _binding = layoutInflater.invoke(inflater)
      if (_binding == null) {
         throw IllegalArgumentException("binding cannot be null")
      }
      return binding.root
   }
}