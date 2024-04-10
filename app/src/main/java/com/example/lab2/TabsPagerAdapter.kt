package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class TabsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    private val fragmentList: List<Fragment> = listOf(
        Tab1Fragment(),
        Tab2Fragment(),
        Tab3Fragment()
    )

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}