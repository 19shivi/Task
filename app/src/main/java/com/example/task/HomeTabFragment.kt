package com.example.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeTabFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view =inflater.inflate(R.layout.fragment_home_tab, container, false)
         var list= ArrayList<Int>()
        list.add(R.drawable.b)
        list.add(R.drawable.baby)
        list.add(R.drawable.baby1)
        list.add(R.drawable.babya)
        list.add(R.drawable.babyb)
        list.add(R.drawable.babycare)
        list.add(R.drawable.babygown)
        list.add(R.drawable.babyjkl)
        list.add(R.drawable.bride)
        list.add(R.drawable.chips)
        list.add(R.drawable.choclate)
        list.add(R.drawable.cocacola)
        list.add(R.drawable.conditioner)
        var recyclerView1=view.findViewById<RecyclerView>(R.id.recycler_explore)
        var recyclerView2=view.findViewById<RecyclerView>(R.id.recycler_lookingfor)
        var adapter= context?.let { ImageRecyclerViewAdapter(list, it) }
        var adapter1= context?.let { ImageRecyclerViewAdapter(list, it) }
        val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL, false)
        val linearLayoutManager1: LinearLayoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.layoutManager=linearLayoutManager
        recyclerView1.adapter=adapter
        recyclerView2.layoutManager=linearLayoutManager1
        recyclerView2.adapter=adapter1

        return view
    }


}