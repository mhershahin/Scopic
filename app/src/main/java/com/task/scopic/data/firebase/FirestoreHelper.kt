package com.task.scopic.data.firebase

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.task.scopic.data.parsToItems
import com.task.scopic.data.parseToFirestoreUser
import com.task.scopic.modles.Item
import com.task.scopic.modles.User
import com.task.scopic.modles.comumunication.MyResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine


class FirestoreHelper  {

     private val USERS = "users"
//     private val EMAIL = "email"
     private val ITEM_LIST = "itemList"


     private val db = Firebase.firestore

      suspend fun createUser(user: User): MyResult<Boolean> = suspendCoroutine{
          val firestoreUser = user.parseToFirestoreUser()
          db.collection(USERS)
               .document(user.uID)
               .set(firestoreUser)
               .addOnSuccessListener { documentReference ->
                   it.resume(MyResult.Success(true))
               }
               .addOnFailureListener { e ->
                   it.resume(MyResult.Error(11,e.toString()))
               }
     }

    suspend fun getAllItem(uId: String): MyResult<MutableList<Item>> = suspendCoroutine{
        db.collection(USERS)
            .document(uId).get()
            .addOnSuccessListener { documentSnapshot ->
                val firestoreItems:MutableList<String> = documentSnapshot.get(ITEM_LIST) as MutableList<String>
                it.resume(MyResult.Success(firestoreItems.parsToItems()))

            }
            .addOnFailureListener { e ->
                it.resume(MyResult.Error(12,e.toString()))
            }
    }

      suspend fun updateItemList(user: User) = withContext(Dispatchers.IO){
          val firestoreUser =user.parseToFirestoreUser()
          db.collection(USERS)
              .document(user.uID)
              .set(firestoreUser)
     }


}