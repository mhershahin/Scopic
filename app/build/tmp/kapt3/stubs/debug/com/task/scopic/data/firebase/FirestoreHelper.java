package com.task.scopic.data.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\t2\u0006\u0010\u0011\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\'\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/task/scopic/data/firebase/FirestoreHelper;", "", "()V", "ITEM_LIST", "", "USERS", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "createUser", "Lcom/task/scopic/modles/comumunication/MyResult;", "", "user", "Lcom/task/scopic/modles/User;", "(Lcom/task/scopic/modles/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllItem", "", "Lcom/task/scopic/modles/Item;", "uId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateItemList", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "app_debug"})
public final class FirestoreHelper {
    private final java.lang.String USERS = "users";
    private final java.lang.String ITEM_LIST = "itemList";
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createUser(@org.jetbrains.annotations.NotNull()
    com.task.scopic.modles.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.task.scopic.modles.comumunication.MyResult<java.lang.Boolean>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllItem(@org.jetbrains.annotations.NotNull()
    java.lang.String uId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.task.scopic.modles.comumunication.MyResult<? extends java.util.List<com.task.scopic.modles.Item>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateItemList(@org.jetbrains.annotations.NotNull()
    com.task.scopic.modles.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.android.gms.tasks.Task<java.lang.Void>> p1) {
        return null;
    }
    
    public FirestoreHelper() {
        super();
    }
}