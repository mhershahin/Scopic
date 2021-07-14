package com.task.scopic.ui.main.fragments.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.task.scopic.app.Repository
import kotlinx.coroutines.launch

class ProfileViewModel(private val repository: Repository) : ViewModel() {
    val userLiveData = repository.getUserLiveData()

    fun singOut() {
        viewModelScope.launch {
            repository.singOut()
        }
    }
}