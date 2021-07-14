package com.task.scopic.ui.main.fragments.info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J$\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0017J\b\u0010*\u001a\u00020\u001dH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/task/scopic/ui/main/fragments/info/InfoFragment;", "Landroidx/fragment/app/Fragment;", "infoViewModel", "Lcom/task/scopic/ui/main/fragments/info/InfoViewModel;", "repository", "Lcom/task/scopic/app/Repository;", "dialogHelper", "Lcom/task/scopic/utils/dialog/DialogHelper;", "(Lcom/task/scopic/ui/main/fragments/info/InfoViewModel;Lcom/task/scopic/app/Repository;Lcom/task/scopic/utils/dialog/DialogHelper;)V", "adapter", "Lcom/task/scopic/ui/main/fragments/info/adapter/ItemAdapter;", "addItem", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "currentDBType", "Lcom/task/scopic/data/DBType;", "infoSwitcher", "Landroidx/appcompat/widget/SwitchCompat;", "itemTouchCallback", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "items", "", "Lcom/task/scopic/modles/Item;", "itemsRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "loadingDialog", "Lcom/task/scopic/utils/dialog/LoadingDialog;", "profileButton", "Landroidx/appcompat/widget/AppCompatTextView;", "getAllItems", "", "initRecycler", "initView", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "showAddDialog", "app_debug"})
public final class InfoFragment extends androidx.fragment.app.Fragment {
    private final java.util.List<com.task.scopic.modles.Item> items = null;
    private com.task.scopic.ui.main.fragments.info.adapter.ItemAdapter adapter;
    private androidx.recyclerview.widget.RecyclerView itemsRecycler;
    private androidx.appcompat.widget.AppCompatTextView profileButton;
    private com.google.android.material.floatingactionbutton.FloatingActionButton addItem;
    private androidx.appcompat.widget.SwitchCompat infoSwitcher;
    private com.task.scopic.utils.dialog.LoadingDialog loadingDialog;
    private com.task.scopic.data.DBType currentDBType = com.task.scopic.data.DBType.FIRESTOR;
    private final androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback itemTouchCallback = null;
    private final com.task.scopic.ui.main.fragments.info.InfoViewModel infoViewModel = null;
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
    
    private final void getAllItems() {
    }
    
    private final void initView(android.view.View view) {
    }
    
    private final void showAddDialog() {
    }
    
    @android.annotation.SuppressLint(value = {"FragmentLiveDataObserve"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecycler() {
    }
    
    public InfoFragment(@org.jetbrains.annotations.NotNull()
    com.task.scopic.ui.main.fragments.info.InfoViewModel infoViewModel, @org.jetbrains.annotations.NotNull()
    com.task.scopic.app.Repository repository, @org.jetbrains.annotations.NotNull()
    com.task.scopic.utils.dialog.DialogHelper dialogHelper) {
        super();
    }
}