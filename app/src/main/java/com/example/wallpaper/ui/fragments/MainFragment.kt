package com.example.wallpaper.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.wallpaper.databinding.FragmentMainBinding
import com.example.wallpaper.ui.fragments.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator


class MainFragment : Fragment() {

   private var _binding: FragmentMainBinding? = null
   private val binding by lazy { _binding!! }

   private val tabTitles = listOf("Home", "Popular", "Random", "Categories")
   private val fragmentsT =
       listOf(HomeFragment(), PopularFragment(), RandomFragment(), CategoriesFragment())

   override fun onCreateView(
       inflater: LayoutInflater, container: ViewGroup?,
       savedInstanceState: Bundle?
   ): View {
      _binding = FragmentMainBinding.inflate(inflater, container, false)
      return binding.root
   }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)

      initViewPager()
      initTabLayout()
      initToolBar()
   }

   private fun initTabLayout() {
      TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
         tab.text = tabTitles[position]
      }.attach()
   }

   private fun initViewPager() {
      val pagerAdapter = ViewPagerAdapter(context as FragmentActivity, fragmentsT)
      binding.viewPager.apply {
         adapter = pagerAdapter
         isUserInputEnabled = false
      }
   }

   private fun initToolBar(){
      binding.toolbar.title = "Wallpaper"
      (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)
   }

   override fun onDestroyView() {
      super.onDestroyView()
      _binding = null
   }
}