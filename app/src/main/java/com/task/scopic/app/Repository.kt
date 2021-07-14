package com.task.scopic.app

import androidx.lifecycle.MutableLiveData
import com.task.scopic.data.DBType
import com.task.scopic.data.db.RealmHelper
import com.task.scopic.data.firebase.FirestoreHelper
import com.task.scopic.data.firebase.MyFirebaseAuth
import com.task.scopic.modles.Item
import com.task.scopic.modles.User
import com.task.scopic.modles.comumunication.MyResult
import com.task.scopic.ui.main.fragments.MainFragmentType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext

class Repository(
    private val myFirebaseAuth: MyFirebaseAuth,
    private val firestoreHelper: FirestoreHelper,
    private val realmHelper: RealmHelper
) {

    private lateinit var user :User
    private val userLiveData = MutableLiveData<MyResult<User>>()

    fun getUserLiveData():MutableLiveData<MyResult<User>>{
        return userLiveData
    }


    private val singUpLiveData = MutableLiveData<MyResult<Boolean>>()
    private val singInLiveData = MutableLiveData<MyResult<Boolean>>()

    fun getSingUpLiveData(): MutableLiveData<MyResult<Boolean>> {
        return singUpLiveData
    }

    fun getSingInLiveData(): MutableLiveData<MyResult<Boolean>> {
        return singInLiveData
    }

    suspend fun singUp(email: String, password: String) = coroutineScope {
        val isSingUp = withContext(Dispatchers.Default) { myFirebaseAuth.singUp(email, password) }
        if (isSingUp is MyResult.Success) {
                if(myFirebaseAuth.auth.currentUser!=null){
                    user = User(myFirebaseAuth.auth.currentUser?.email!!,myFirebaseAuth.auth.currentUser?.uid!!, mutableListOf())
                    withContext(Dispatchers.Default) { firestoreHelper.createUser(user) }
                    withContext(Dispatchers.Default) { realmHelper.createUser(user) }
                }
        }
        singUpLiveData.postValue(isSingUp)
    }

    suspend fun singIn(email: String, password: String) = coroutineScope {
        val isSingIn = withContext(Dispatchers.Default) { myFirebaseAuth.singIn(email, password)
        }
        if(myFirebaseAuth.auth.currentUser != null){
            user = User(myFirebaseAuth.auth.currentUser?.email!!,myFirebaseAuth.auth.currentUser?.uid!!,mutableListOf())
        }

        singInLiveData.postValue(isSingIn)

        if(isSingIn is MyResult.Success){
            changeMainFragment(MainFragmentType.INFO)
        }
    }

    //Main
    private var myMainFragmentType: MainFragmentType = MainFragmentType.SING_IN
    private val mainFragmentTypeLiveData = MutableLiveData<MainFragmentType>()

    fun getMainFragmentTypeLiveData(): MutableLiveData<MainFragmentType> {
        mainFragmentTypeLiveData.postValue(myMainFragmentType)
        return mainFragmentTypeLiveData
    }

    fun changeMainFragment(mainFragmentType: MainFragmentType) {
        this.myMainFragmentType = mainFragmentType
        mainFragmentTypeLiveData.postValue(myMainFragmentType)
    }


    suspend fun singOut() = coroutineScope {
        withContext(Dispatchers.Default) { myFirebaseAuth.singOut() }
    }


    suspend fun getAllItem(dbType: DBType) = coroutineScope {
       when (dbType) {
            DBType.FIRESTOR -> {
                val items:MyResult<MutableList<Item>> = withContext(Dispatchers.Default) { firestoreHelper.getAllItem(user.uID) }
                if(items is MyResult.Success){
                    user.itemList.clear()
                    user.itemList.addAll(items.data)
                    userLiveData.postValue(MyResult.Success(user))
                }else if(items is MyResult.Error){
                    userLiveData.postValue(MyResult.Error(items.errorCode,items.errorMessages))
                }
            }
            DBType.REALM -> {
                val items:MyResult<MutableList<Item>> = withContext(Dispatchers.Default) { realmHelper.getAllItem(user.uID) }
                if(items is MyResult.Success){
                    user.itemList.clear()
                    user.itemList.addAll(items.data)
                    userLiveData.postValue(MyResult.Success(user))
                }else  if(items is MyResult.Error){
                    //If not User Create new User
                     userLiveData.postValue(MyResult.Error(items.errorCode,items.errorMessages))
                     withContext(Dispatchers.Default) { realmHelper.createUser(User(user.email,user.uID, mutableListOf())) }

                }
            }
        }


    }

    suspend fun addItem(dbType: DBType, item: Item) = coroutineScope{
        user.itemList.add(item)
        when(dbType){
            DBType.FIRESTOR ->{
                withContext(Dispatchers.Default) { firestoreHelper.updateItemList(user)
                }

            }
            DBType.REALM ->{
                withContext(Dispatchers.Default) { realmHelper.addItem(user.uID, item)
                }

            }
        }
        userLiveData.postValue(MyResult.Success(user))
    }

    suspend fun removeItem(dbType: DBType, itemPosition: Int) = coroutineScope {
        user.itemList.removeAt(itemPosition)
        when(dbType){
            DBType.FIRESTOR ->{
                async { firestoreHelper.updateItemList(user) }
            }
            DBType.REALM ->{
              async { realmHelper.removeItem(user.uID,itemPosition) }
            }
        }
        userLiveData.postValue(MyResult.Success(user))
    }

}