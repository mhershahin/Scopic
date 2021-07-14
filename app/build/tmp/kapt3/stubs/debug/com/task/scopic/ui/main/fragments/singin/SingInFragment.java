package com.task.scopic.ui.main.fragments.singin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\b\u0010 \u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/task/scopic/ui/main/fragments/singin/SingInFragment;", "Landroidx/fragment/app/Fragment;", "singInViewModel", "Lcom/task/scopic/ui/main/fragments/singin/SingInViewModel;", "repository", "Lcom/task/scopic/app/Repository;", "dialogHelper", "Lcom/task/scopic/utils/dialog/DialogHelper;", "(Lcom/task/scopic/ui/main/fragments/singin/SingInViewModel;Lcom/task/scopic/app/Repository;Lcom/task/scopic/utils/dialog/DialogHelper;)V", "email", "", "loadingDialog", "Lcom/task/scopic/utils/dialog/LoadingDialog;", "pass", "singInButton", "Landroidx/appcompat/widget/AppCompatTextView;", "singInEmail", "Landroidx/appcompat/widget/AppCompatEditText;", "singInPass", "singUp", "initView", "", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "trySingIn", "app_debug"})
public final class SingInFragment extends androidx.fragment.app.Fragment {
    private com.task.scopic.utils.dialog.LoadingDialog loadingDialog;
    private androidx.appcompat.widget.AppCompatTextView singInButton;
    private androidx.appcompat.widget.AppCompatTextView singUp;
    private androidx.appcompat.widget.AppCompatEditText singInEmail;
    private androidx.appcompat.widget.AppCompatEditText singInPass;
    private java.lang.String email = "";
    private java.lang.String pass = "";
    private final com.task.scopic.ui.main.fragments.singin.SingInViewModel singInViewModel = null;
    private final com.task.scopic.app.Repository repository = null;
    private final com.task.scopic.utils.dialog.DialogHelper dialogHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initView(android.view.View view) {
    }
    
    private final void trySingIn() {
    }
    
    @android.annotation.SuppressLint(value = {"FragmentLiveDataObserve"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public SingInFragment(@org.jetbrains.annotations.NotNull()
    com.task.scopic.ui.main.fragments.singin.SingInViewModel singInViewModel, @org.jetbrains.annotations.NotNull()
    com.task.scopic.app.Repository repository, @org.jetbrains.annotations.NotNull()
    com.task.scopic.utils.dialog.DialogHelper dialogHelper) {
        super();
    }
}