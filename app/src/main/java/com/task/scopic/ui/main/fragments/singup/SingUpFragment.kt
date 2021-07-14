package com.task.scopic.ui.main.fragments.singup

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

class SingUpFragment(
    private val singUpViewModel: SingUpViewModel,
    private val repository: Repository,
    private val dialogHelper: DialogHelper
) : Fragment() {

    private lateinit var loadingDialog: LoadingDialog

    private lateinit var singUpButton: AppCompatTextView
    private lateinit var singIn: AppCompatTextView
    private lateinit var singUpEmail: AppCompatEditText
    private lateinit var singUpPass: AppCompatEditText
    private var email: String = ""
    private var pass: String = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_sing_up, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        loadingDialog = LoadingDialog(view.context)

        singIn = view.findViewById(R.id.singIn)
        singUpButton = view.findViewById(R.id.singUpButton)
        singUpEmail = view.findViewById(R.id.singUpEmail)
        singUpPass = view.findViewById(R.id.singUpPass)

        singIn.setOnClickListener { repository.changeMainFragment(MainFragmentType.SING_IN) }
        singUpButton.setOnClickListener { trySingUp() }
        singUpEmail.afterTextChanged { email = it }
        singUpPass.afterTextChanged { pass = it }
    }

    private fun trySingUp() {
        //Own validation
        if (email.isEmailValid() && pass.isPassValid()) {
            loadingDialog.show()
            singUpViewModel.singUp(email, pass)
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
        singUpViewModel.singUpLiveData.observe(this, {
            when (it) {
                is MyResult.Success -> {
                    loadingDialog.dismiss()
                    repository.changeMainFragment(MainFragmentType.WELCOME)
                }
                is MyResult.Error -> {
                    loadingDialog.dismiss()
                    dialogHelper.showErrorDialog(activity as Context, it.errorMessages)
                }
            }
        })
    }


}