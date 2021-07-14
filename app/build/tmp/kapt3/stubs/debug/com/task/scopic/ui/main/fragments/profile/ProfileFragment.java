package com.task.scopic.ui.main.fragments.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0017J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/task/scopic/ui/main/fragments/profile/ProfileFragment;", "Landroidx/fragment/app/Fragment;", "profileViewModel", "Lcom/task/scopic/ui/main/fragments/profile/ProfileViewModel;", "repository", "Lcom/task/scopic/app/Repository;", "dialogHelper", "Lcom/task/scopic/utils/dialog/DialogHelper;", "(Lcom/task/scopic/ui/main/fragments/profile/ProfileViewModel;Lcom/task/scopic/app/Repository;Lcom/task/scopic/utils/dialog/DialogHelper;)V", "myActivity", "Lcom/task/scopic/ui/main/MainActivity;", "profileBack", "Landroidx/appcompat/widget/AppCompatTextView;", "profileEmail", "profileLogOut", "initViews", "", "view", "Landroid/view/View;", "logOut", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "updateInfo", "it", "Lcom/task/scopic/modles/User;", "app_debug"})
public final class ProfileFragment extends androidx.fragment.app.Fragment {
    private androidx.appcompat.widget.AppCompatTextView profileBack;
    private androidx.appcompat.widget.AppCompatTextView profileEmail;
    private androidx.appcompat.widget.AppCompatTextView profileLogOut;
    private com.task.scopic.ui.main.MainActivity myActivity;
    private final com.task.scopic.ui.main.fragments.profile.ProfileViewModel profileViewModel = null;
    private final com.task.scopic.app.Repository repository = null;
    private final com.task.scopic.utils.dialog.DialogHelper dialogHelper = null;
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initViews(android.view.View view) {
    }
    
    @android.annotation.SuppressLint(value = {"FragmentLiveDataObserve"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateInfo(com.task.scopic.modles.User it) {
    }
    
    private final void logOut() {
    }
    
    public ProfileFragment(@org.jetbrains.annotations.NotNull()
    com.task.scopic.ui.main.fragments.profile.ProfileViewModel profileViewModel, @org.jetbrains.annotations.NotNull()
    com.task.scopic.app.Repository repository, @org.jetbrains.annotations.NotNull()
    com.task.scopic.utils.dialog.DialogHelper dialogHelper) {
        super();
    }
}