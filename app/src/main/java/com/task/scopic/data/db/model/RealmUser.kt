package com.task.scopic.data.db.model

import io.realm.RealmList
import io.realm.RealmObject

open class RealmUser(var uId: String = "", var items: RealmList<RealmItem> = RealmList()):RealmObject()