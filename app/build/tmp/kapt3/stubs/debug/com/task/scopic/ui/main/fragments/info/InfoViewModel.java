package com.task.scopic.ui.main.fragments.info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/task/scopic/ui/main/fragments/info/InfoViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/task/scopic/app/Repository;", "(Lcom/task/scopic/app/Repository;)V", "userLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/task/scopic/modles/comumunication/MyResult;", "Lcom/task/scopic/modles/User;", "getUserLiveData", "()Landroidx/lifecycle/MutableLiveData;", "addItem", "", "dbType", "Lcom/task/scopic/data/DBType;", "item", "Lcom/task/scopic/modles/Item;", "getAllItem", "removeItem", "itemPosition", "", "app_debug"})
public final class InfoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.task.scopic.modles.comumunication.MyResult<com.task.scopic.modles.User>> userLiveData = null;
    private final com.task.scopic.app.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.task.scopic.modles.comumunication.MyResult<com.task.scopic.modles.User>> getUserLiveData() {
        return null;
    }
    
    public final void getAllItem(@org.jetbrains.annotations.NotNull()
    com.task.scopic.data.DBType dbType) {
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull()
    com.task.scopic.data.DBType dbType, @org.jetbrains.annotations.NotNull()
    com.task.scopic.modles.Item item) {
    }
    
    public final void removeItem(@org.jetbrains.annotations.NotNull()
    com.task.scopic.data.DBType dbType, int itemPosition) {
    }
    
    public InfoViewModel(@org.jetbrains.annotations.NotNull()
    com.task.scopic.app.Repository repository) {
        super();
    }
}