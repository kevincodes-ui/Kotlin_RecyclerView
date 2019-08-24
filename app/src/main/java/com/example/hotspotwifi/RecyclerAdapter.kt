package com.example.hotspotwifi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val itemList: ArrayList<RcvModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val _v = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)
        return ViewHolder(_v)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // get image res images
        holder.image.setImageResource(itemList[position].getImages())
        // get title
        holder.title.setText(itemList[position].getTitles())
    }

    inner class ViewHolder(_view : View) : RecyclerView.ViewHolder(_view){
        var title: TextView
        var image: ImageView

        init {

            title = itemView.findViewById(R.id.textView) as TextView
            image = itemView.findViewById(R.id.imageView) as ImageView
        }
    }
}
