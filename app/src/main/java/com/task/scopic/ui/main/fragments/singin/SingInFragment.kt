package com.task.scopic.ui.main.fragments.singin

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import com.task.scopic.R
import com.task.scopic.app.Repository
import com.task.scopic.modles.comumunication.MyResult
import com.task.scopic.ui.main.fragments.MainFragmentType
import com.task.scopic.utils.dialog.DialogHelper
import com.task.scopic.utils.dialog.LoadingDialog
import com.task.scopic.utils.extension.afterTextChanged
import com.task.scopic.utils.extension.isEmailValid
import com.task.scopic.utils.extension.isPassValid

class SingInFragment(
    private val singInViewModel: SingInViewModel,
    private val repository: Repository,
    private val dialogHelper: DialogHelper
) : Fragment() {

    private lateinit var loadingDialog: LoadingDialog
    private lateinit var singInButton: AppCompatTextView
    private lateinit var singUp: AppCompatTextView
    private lateinit var singInEmail: AppCompatEditText
    private lateinit var singInPass: AppCompatEditText


    private var email: String = ""
    private var pass: String = ""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_sing_in, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        //init Views
        loadingDialog = LoadingDialog(view.context)
        singUp = view.findViewById(R.id.singUp)
        singInButton = view.findViewById(R.id.singInButton)
        singInEmail = view.findViewById(R.id.singInEmail)
        singInPass = view.findViewById(R.id.singInPass)


        singInEmail.afterTextChanged { email = it }
        singInPass.afterTextChanged { pass = it }
        singUp.setOnClickListener { repository.changeMainFragment(MainFragmentType.SING_UP) }
        singInButton.setOnClickListener { trySingIn() }
    }

    private fun trySingIn() {
        //Own validation
        if (email.isEmailValid() && pass.isPassValid()) {
            loadingDialog.show()
            singInViewModel.singIn(email, pass)
        } else {
            if (!email.isEmailValid()) {
                dialogHelper.showErrorDialog(activity as Context, getString(R.string.email_valid))
            } else if (!pass.isPassValid()) {
                dialogHelper.showErrorDialog(activity as Context, getString(R.string.pass_valid))
            }
        }
    }


    @SuppressLint("FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        singInViewModel.singInLiveData.observe(this, {
            loadingDialog.dismiss()
            if(it is MyResult.Error){
                loadingDialog.dismiss()
                dialogHelper.showErrorDialog(activity as Context, it.errorMessages)
            }
        })
    }


}