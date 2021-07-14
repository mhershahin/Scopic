package com.task.scopic.modles.comumunication


sealed class MyResult<out T>{
    data class Success<out T:Any>(val data:T):MyResult<T>()
    data class Error(val errorCode:Int,val errorMessages: String):MyResult<Nothing>()
}
