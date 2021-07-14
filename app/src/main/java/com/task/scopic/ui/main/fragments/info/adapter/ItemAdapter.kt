package com.task.scopic.ui.main.fragments.info.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.task.scopic.R
import com.task.scopic.modles.Item


class ItemAdapter(private val itemList: MutableList<Item>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    //it make easy to add new Cards
    private val ITEM_CARD = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            ITEM_CARD->{
                val viewItem = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
                ItemCard(viewItem)
            }else ->{
                val viewItem = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
                ItemCard(viewItem)
            }
        }
    }
    override fun getItemCount(): Int {
        return itemList.size
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ItemCard ->{
                holder.bind(itemList[position])
            }
        }
    }
    override fun getItemViewType(position: Int): Int {
        return ITEM_CARD
    }
}