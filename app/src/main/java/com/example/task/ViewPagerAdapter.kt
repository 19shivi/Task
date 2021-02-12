package com.example.task

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? =  HomeTabFragment()
        if (position == 0) fragment = HomeTabFragment() else if (position == 1) fragment =
            QATabFragment()
        Log.v("tab posittion",position.toString())
        return fragment!!
    }
    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) title = "Home" else if (position == 1) title =
            "Q/A"
        return title
    }
}