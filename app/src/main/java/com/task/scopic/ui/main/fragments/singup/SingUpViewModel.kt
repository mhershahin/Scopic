package com.task.scopic.ui.main.fragments.singup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.task.scopic.app.Repository
import kotlinx.coroutines.launch

class SingUpViewModel(private val repository: Repository) :ViewModel() {

    val singUpLiveData =repository.getSingUpLiveData()

    fun singUp(email:String,pass:String){
        viewModelScope.launch{
            repository.singUp(email,pass)
        }
    }
}