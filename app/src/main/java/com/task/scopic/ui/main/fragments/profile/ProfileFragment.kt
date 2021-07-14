package com.task.scopic.ui.main.fragments.profile

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import com.task.scopic.R
import com.task.scopic.app.Repository
import com.task.scopic.modles.User
import com.task.scopic.modles.comumunication.MyResult
import com.task.scopic.ui.main.MainActivity
import com.task.scopic.ui.main.fragments.MainFragmentType
import com.task.scopic.utils.dialog.DialogHelper

class ProfileFragment(
    private val profileViewModel: ProfileViewModel,
    private val repository: Repository,
    private val dialogHelper: DialogHelper
) : Fragment() {

    private lateinit var profileBack: AppCompatTextView
    private lateinit var profileEmail: AppCompatTextView
    private lateinit var profileLogOut: AppCompatTextView

    private lateinit var myActivity:MainActivity
    override fun onAttach(context: Context) {
        super.onAttach(context)
        myActivity = context as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_profile, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        profileBack = view.findViewById(R.id.profileBack)
        profileEmail = view.findViewById(R.id.profileEmail)
        profileLogOut = view.findViewById(R.id.profileLogOut)

        profileBack.setOnClickListener { repository.changeMainFragment(MainFragmentType.INFO) }
        profileLogOut.setOnClickListener { logOut() }
    }

    @SuppressLint("FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        profileViewModel.userLiveData.observe(this, {
            if (it is MyResult.Success) {
                updateInfo(it.data)
            } else if (it is MyResult.Error) {
                dialogHelper.showErrorDialog(activity as Context, it.errorMessages)
            }
        })
    }

    private fun updateInfo(it: User) {
        profileEmail.text = it.email
    }
    private fun logOut() {
        profileViewModel.singOut()
        repository.changeMainFragment(MainFragmentType.SING_IN)
    }
}