package com.task.scopic.data.db.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/task/scopic/data/db/model/RealmUser;", "Lio/realm/RealmObject;", "uId", "", "items", "Lio/realm/RealmList;", "Lcom/task/scopic/data/db/model/RealmItem;", "(Ljava/lang/String;Lio/realm/RealmList;)V", "getItems", "()Lio/realm/RealmList;", "setItems", "(Lio/realm/RealmList;)V", "getUId", "()Ljava/lang/String;", "setUId", "(Ljava/lang/String;)V", "app_debug"})
public class RealmUser extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String uId;
    @org.jetbrains.annotations.NotNull()
    private io.realm.RealmList<com.task.scopic.data.db.model.RealmItem> items;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUId() {
        return null;
    }
    
    public final void setUId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<com.task.scopic.data.db.model.RealmItem> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<com.task.scopic.data.db.model.RealmItem> p0) {
    }
    
    public RealmUser(@org.jetbrains.annotations.NotNull()
    java.lang.String uId, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<com.task.scopic.data.db.model.RealmItem> items) {
        super();
    }
    
    public RealmUser() {
        super();
    }
}