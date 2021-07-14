package com.task.scopic.data

import com.task.scopic.data.db.model.RealmItem
import com.task.scopic.data.db.model.RealmUser
import com.task.scopic.data.firebase.model.FirestoreUser
import com.task.scopic.modles.Item
import com.task.scopic.modles.User
import io.realm.RealmList

fun User.parseToRealm():RealmUser{
val realmList = RealmList<RealmItem>()
    for(item in this.itemList){
        realmList.add(RealmItem(item.item))
    }
    return RealmUser(this.uID,realmList)
}


fun User.parseToFirestoreUser():FirestoreUser{
    val firestoreList = mutableListOf<String>()
    for(item in this.itemList){
        firestoreList.add(item.item)
    }
    return FirestoreUser(this.email,firestoreList)
}

fun MutableList<String>.parsToItems():MutableList<Item>{
    val itemList = mutableListOf<Item>()
    for(item in this){
        itemList.add(Item(item))
    }
    return itemList
}

fun RealmUser.getItems():MutableList<Item>{
    val items = mutableListOf<Item>()
    for(i in this.items){
        items.add(Item(i.item))
    }
    return items
}

fun Item.toRealmItem():RealmItem{
    return RealmItem(this.item)
}
