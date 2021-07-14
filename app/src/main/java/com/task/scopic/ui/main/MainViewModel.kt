package com.task.scopic.ui.main

import androidx.lifecycle.ViewModel
import com.task.scopic.app.Repository

class MainViewModel( private val repository: Repository) : ViewModel() {
    val mainFragmentTypeLiveData = repository.getMainFragmentTypeLiveData()
}