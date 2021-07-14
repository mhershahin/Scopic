package com.task.scopic.ui.main.fragments.info

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.SwitchCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.task.scopic.R
import com.task.scopic.app.Repository
import com.task.scopic.data.DBType
import com.task.scopic.modles.Item
import com.task.scopic.modles.comumunication.MyResult
import com.task.scopic.ui.main.fragments.MainFragmentType
import com.task.scopic.ui.main.fragments.info.adapter.ItemAdapter
import com.task.scopic.utils.dialog.DialogHelper
import com.task.scopic.utils.dialog.IAddDialogCallBack
import com.task.scopic.utils.dialog.LoadingDialog


class InfoFragment(
    private val infoViewModel: InfoViewModel,
    private val repository: Repository,
    private val dialogHelper: DialogHelper
) : Fragment() {

    private val items = mutableListOf<Item>()
    private  var adapter : ItemAdapter =ItemAdapter(items)
    private lateinit var itemsRecycler: RecyclerView
    private lateinit var profileButton: AppCompatTextView
    private lateinit var addItem: FloatingActionButton
    private lateinit var infoSwitcher: SwitchCompat
    private lateinit var loadingDialog: LoadingDialog
    private var currentDBType = DBType.FIRESTOR
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_info, container, false)
        initView(view)
        initRecycler()
        getAllItems()
        return view
    }

    private fun getAllItems() {
        loadingDialog.show()
        infoViewModel.getAllItem(currentDBType)
    }

    private fun initView(view: View) {
        loadingDialog = LoadingDialog(activity as Context)
        itemsRecycler = view.findViewById(R.id.itemsRecycler)
        addItem = view.findViewById(R.id.addItem)
        profileButton = view.findViewById(R.id.profileButton)
        infoSwitcher = view.findViewById(R.id.infoSwitcher)
        profileButton.setOnClickListener { repository.changeMainFragment(MainFragmentType.PROFILE) }
        addItem.setOnClickListener { showAddDialog() }
        infoSwitcher.setOnCheckedChangeListener { _, checked ->
            currentDBType = if (checked) {
                DBType.FIRESTOR
            } else {
                DBType.REALM
            }
            getAllItems()
        }
    }

    private fun showAddDialog() {
        dialogHelper.showAddDialog(activity as Context, object : IAddDialogCallBack {
            override fun add(item: Item) {
                infoViewModel.addItem(currentDBType, item)

            }
        })
    }

    @SuppressLint("FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        infoViewModel.userLiveData.observe(this, {
            loadingDialog.dismiss()
            if (it is MyResult.Success) {
                items.clear()
                items.addAll(it.data.itemList)
                adapter.notifyDataSetChanged()

            } else if (it is MyResult.Error) {
                dialogHelper.showErrorDialog(activity as Context, it.errorMessages)
            }
        })
    }

    private fun initRecycler() {
        itemsRecycler.layoutManager = LinearLayoutManager(activity)
        itemsRecycler.setHasFixedSize(false)
        itemsRecycler.clearFocus()
        itemsRecycler.adapter = adapter

        //add swipe fun
        val itemTouchHelper = ItemTouchHelper(itemTouchCallback)
        itemTouchHelper.attachToRecyclerView(itemsRecycler)
    }

   private val itemTouchCallback: ItemTouchHelper.SimpleCallback = object : ItemTouchHelper.SimpleCallback(
       0,
       ItemTouchHelper.LEFT
   ) {
        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean {
            return false
        }

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
            val position = viewHolder.absoluteAdapterPosition
            infoViewModel.removeItem(currentDBType, position)
        }
    }
}