package com.task.scopic.ui.main.fragments.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/task/scopic/ui/main/fragments/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/task/scopic/app/Repository;", "(Lcom/task/scopic/app/Repository;)V", "userLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/task/scopic/modles/comumunication/MyResult;", "Lcom/task/scopic/modles/User;", "getUserLiveData", "()Landroidx/lifecycle/MutableLiveData;", "singOut", "", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.task.scopic.modles.comumunication.MyResult<com.task.scopic.modles.User>> userLiveData = null;
    private final com.task.scopic.app.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.task.scopic.modles.comumunication.MyResult<com.task.scopic.modles.User>> getUserLiveData() {
        return null;
    }
    
    public final void singOut() {
    }
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.task.scopic.app.Repository repository) {
        super();
    }
}