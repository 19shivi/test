package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list:MutableList<Item> = mutableListOf<Item>()

        list.add(Item("task",true,R.drawable.ic_alarm))
        list.add(Item("task",true,R.drawable.ic_apple))
        list.add(Item("task",true,R.drawable.ic_archive_fill))
        list.add(Item("task",true,R.drawable.ic_badge_ar_fill)) 
        list.add(Item("task",false,R.drawable.ic_basket3_fill)) 
        list.add(Item("task",false,R.drawable.ic_book_half)) 
        list.add(Item("task",true,R.drawable.ic_bounding_box)) 
        list.add(Item("task",true,R.drawable.ic_alarm)) 
        list.add(Item("task",false,R.drawable.ic_apple)) 
        list.add(Item("task",true,R.drawable.ic_archive_fill)) 
        list.add(Item("task",true,R.drawable.ic_badge_ar_fill)) 
        list.add(Item("task",false,R.drawable.ic_basket3_fill)) 
        list.add(Item("task",true,R.drawable.ic_book_half)) 
        list.add(Item("task",true,R.drawable.ic_bounding_box)) 
        list.add(Item("task",false,R.drawable.ic_apple)) 
        list.add(Item("task",true,R.drawable.ic_basket3_fill))
        list.add(Item("task",true,R.drawable.ic_book_half)) 
        list.add(Item("task",true,R.drawable.ic_bounding_box))
        list.add(Item("task",true,R.drawable.ic_alarm))
        list.add(Item("task",false,R.drawable.ic_apple))
        list.add(Item("task",true,R.drawable.ic_archive_fill))
        list.add(Item("task",true,R.drawable.ic_badge_ar_fill))
        list.add(Item("task",false,R.drawable.ic_basket3_fill))
        list.add(Item("task",true,R.drawable.ic_book_half))
        list.add(Item("task",true,R.drawable.ic_bounding_box))
        list.add(Item("task",false,R.drawable.ic_apple))
        list.add(Item("task",true,R.drawable.ic_basket3_fill))
        list.add(Item("task",true,R.drawable.ic_book_half))
        val  gridLayoutManager:GridLayoutManager= GridLayoutManager(this,3)
        val recycle:RecyclerView=findViewById(R.id.recycler)
        recycle.layoutManager=gridLayoutManager
        recycle.adapter=GridRecyclerview(list)


    }
}