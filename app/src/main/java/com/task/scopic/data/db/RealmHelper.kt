package com.task.scopic.data.db

import android.content.Context
import com.task.scopic.data.db.model.RealmUser
import com.task.scopic.data.getItems
import com.task.scopic.data.parseToRealm
import com.task.scopic.data.toRealmItem
import com.task.scopic.modles.Item
import com.task.scopic.modles.User
import com.task.scopic.modles.comumunication.MyResult
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class RealmHelper(context: Context) {
    //Realm is mongo DB
    private val REALM_NAME = "${context.packageName}.db.realm"
    private val UID_FILE = "uId"

    init {
        Realm.init(context)
        val realmConfiguration = RealmConfiguration.Builder()
            .name(REALM_NAME)
            .deleteRealmIfMigrationNeeded()
            .schemaVersion(0)
            .build()
        Realm.setDefaultConfiguration(realmConfiguration)
    }

    private fun getRealm(): Realm {
        return Realm.getDefaultInstance()
    }

    suspend fun createUser(user: User) = withContext(Dispatchers.IO) {
        val myUser = user.parseToRealm()
        getRealm().executeTransaction { realm ->
            val realmUser = realm.createObject(RealmUser::class.java)
            realmUser.uId = myUser.uId
            realmUser.items = myUser.items
        }
    }

    suspend fun getAllItem(uId: String): MyResult<MutableList<Item>> = suspendCoroutine {
        val realmUser = getRealm().where(RealmUser::class.java).equalTo(UID_FILE, uId).findFirst()
        if(realmUser!=null){
            it.resume(MyResult.Success(realmUser.getItems()))
        }else{
            it.resume(MyResult.Error(-2, "Realm Error"))
        }
    }

    suspend fun addItem(uId: String, item: Item) = withContext(Dispatchers.IO) {
        getRealm().executeTransaction { realm ->
            val realmUser = realm.where(RealmUser::class.java).equalTo(UID_FILE, uId).findFirst()
            realmUser?.items?.add(item.toRealmItem())
        }
    }

    suspend fun removeItem(uID: String, itemPosition: Int) = withContext(Dispatchers.IO) {
        getRealm().executeTransaction { realm ->
            val realmUser =  realm.where(RealmUser::class.java).equalTo(UID_FILE, uID).findFirst()
           realmUser?.items?.get(itemPosition)?.deleteFromRealm()
        }
    }
}

