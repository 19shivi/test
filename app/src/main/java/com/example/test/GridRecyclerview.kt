package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GridRecyclerview(var list:MutableList<Item>) : RecyclerView.Adapter<GridRecyclerview.ViewHolder>() {
    var visibleList:MutableList<Item> = mutableListOf<Item>()
    init {
       list.forEach {
           if(it.isVisible)
           {
               visibleList.add(it);
           }

       }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridRecyclerview.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridRecyclerview.ViewHolder, position: Int) {
        holder.icon.setImageResource(visibleList.get(position).imgResource);
        holder.title.setText(visibleList.get(position).name)
    }

    override fun getItemCount(): Int {return visibleList.size;
    }

     fun updateList(listNew: MutableList<Item>)
     {
        visibleList= mutableListOf<Item>()

             listNew.forEach {
                 if (it.isVisible) {
                     visibleList.add(it);
                 }
             }
         notifyDataSetChanged();


     }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val icon:ImageView=itemView.findViewById(R.id.icon);
        val title:TextView=itemView.findViewById(R.id.title);
    }


}