package com.example.task

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view= inflater.inflate(R.layout.fragment_home, container, false)
        var viewPager = view.findViewById<ViewPager>(R.id.viewpager);
        var tabLayout:TabLayout = view.findViewById<TabLayout>(R.id.tablayout);

        var viewPagerAdapter = ViewPagerAdapter(childFragmentManager)
        viewPager?.adapter=viewPagerAdapter
        Log.v("error ","shivam")
        // It is used to join TabLayout with ViewPager.
        tabLayout?.setupWithViewPager(viewPager);
        return view
    }


}