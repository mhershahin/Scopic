package com.task.scopic.ui.main.fragments.info.adapter

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.task.scopic.R
import com.task.scopic.modles.Item

class ItemCard(view: View) : RecyclerView.ViewHolder(view) {
    private var itemTitle: AppCompatTextView = view.findViewById(R.id.itemTitle)
    fun bind(item: Item) {
        itemTitle.text = item.item
    }
}