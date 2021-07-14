package com.task.scopic.data.firebase


import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.task.scopic.modles.comumunication.MyResult
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class MyFirebaseAuth() {

     val auth: FirebaseAuth = Firebase.auth

    suspend fun singUp(email:String,password:String): MyResult<Boolean> = suspendCoroutine{
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    it.resume(MyResult.Success(true))
                } else {
                    it.resume(MyResult.Error(-1,task.exception?.message.toString()))
                }
            }
    }
    suspend fun singIn(email:String,password:String) : MyResult<Boolean> = suspendCoroutine{
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener{ task ->
                if (task.isSuccessful) {
                    it.resume(MyResult.Success(true))
                } else {
                    it.resume(MyResult.Error(-1,task.exception?.message.toString()))
                }
            }
    }

    suspend fun singOut() : MyResult<Boolean> = suspendCoroutine{
       auth.signOut()
        it.resume(MyResult.Success(true))
    }
}