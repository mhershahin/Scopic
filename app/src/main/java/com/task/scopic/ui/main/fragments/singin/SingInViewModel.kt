package com.task.scopic.ui.main.fragments.singin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.task.scopic.app.Repository
import kotlinx.coroutines.launch

class SingInViewModel(private val repository: Repository) :ViewModel() {
     val singInLiveData =repository.getSingInLiveData()
    fun singIn(email:String,pass:String){
        viewModelScope.launch{
            repository.singIn(email,pass)
        }
    }
}