package com.task.scopic.ui.main.fragments.info

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.task.scopic.app.Repository
import com.task.scopic.data.DBType
import com.task.scopic.modles.Item
import kotlinx.coroutines.launch

class InfoViewModel(private val repository: Repository) :ViewModel() {
    val userLiveData = repository.getUserLiveData()
    fun getAllItem(dbType: DBType){
        viewModelScope.launch {
            repository.getAllItem(dbType)
        }
    }
     fun addItem(dbType: DBType,item: Item)  {
       viewModelScope.launch {
           repository.addItem(dbType,item)
       }
    }
     fun removeItem(dbType: DBType,itemPosition: Int){
        viewModelScope.launch {
            repository.removeItem(dbType,itemPosition)
        }
    }

}