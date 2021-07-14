package com.task.scopic.data.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00140\u00132\u0006\u0010\n\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0002J!\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/task/scopic/data/db/RealmHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "REALM_NAME", "", "UID_FILE", "addItem", "", "uId", "item", "Lcom/task/scopic/modles/Item;", "(Ljava/lang/String;Lcom/task/scopic/modles/Item;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUser", "user", "Lcom/task/scopic/modles/User;", "(Lcom/task/scopic/modles/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllItem", "Lcom/task/scopic/modles/comumunication/MyResult;", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRealm", "Lio/realm/Realm;", "removeItem", "uID", "itemPosition", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RealmHelper {
    private final java.lang.String REALM_NAME = null;
    private final java.lang.String UID_FILE = "uId";
    
    private final io.realm.Realm getRealm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createUser(@org.jetbrains.annotations.NotNull()
    com.task.scopic.modles.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllItem(@org.jetbrains.annotations.NotNull()
    java.lang.String uId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.task.scopic.modles.comumunication.MyResult<? extends java.util.List<com.task.scopic.modles.Item>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addItem(@org.jetbrains.annotations.NotNull()
    java.lang.String uId, @org.jetbrains.annotations.NotNull()
    com.task.scopic.modles.Item item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeItem(@org.jetbrains.annotations.NotNull()
    java.lang.String uID, int itemPosition, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    public RealmHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}