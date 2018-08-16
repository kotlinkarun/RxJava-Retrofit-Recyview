package com.demo.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.demo.R
import com.demo.model.Record
import kotlinx.android.synthetic.main.row_layout.view.*

class MyAdapter(private val list: List<Record>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return list.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener {

        val context:Context=itemView.context

        fun bindItem(model: Record) {

            itemView.setOnClickListener(this)
            itemView.tv1.text = model.name
            itemView.tv2.text = model.city
            itemView.tv3.text = model.country
        }

        override fun onClick(v: View?) {

             Toast.makeText(context,""+adapterPosition,Toast.LENGTH_SHORT).show()
        }
    }
}

