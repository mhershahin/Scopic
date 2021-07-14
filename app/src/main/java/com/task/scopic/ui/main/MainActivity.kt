package com.task.scopic.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.task.scopic.R
import com.task.scopic.app.Repository
import com.task.scopic.ui.main.fragments.MainFragmentType
import com.task.scopic.ui.main.fragments.info.InfoFragment
import com.task.scopic.ui.main.fragments.profile.ProfileFragment
import com.task.scopic.ui.main.fragments.singin.SingInFragment
import com.task.scopic.ui.main.fragments.singup.SingUpFragment
import com.task.scopic.ui.main.fragments.welcome.WelcomeFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentType: MainFragmentType

    private val mainViewModel: MainViewModel by viewModel()
    private val repository: Repository by inject()

    private val singInFragment: SingInFragment by inject()
    private val singUpFragment: SingUpFragment by inject()
    private val welcomeFragment: WelcomeFragment by inject()
    private val infoFragment: InfoFragment by inject()
    private val profileFragment: ProfileFragment by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.mainFragmentTypeLiveData.observe(this, {
            replaceFragmentByType(it)
        })
    }

    private fun replaceFragmentByType(fragmentType: MainFragmentType) {
        this.fragmentType = fragmentType
        val fragment = when (fragmentType) {
            MainFragmentType.SING_IN -> {
                singInFragment
            }
            MainFragmentType.SING_UP -> {
                singUpFragment
            }
            MainFragmentType.WELCOME -> {
                welcomeFragment
            }
            MainFragmentType.INFO -> {
                infoFragment
            }
            MainFragmentType.PROFILE -> {
                profileFragment
            }
        }
        replaceFragment(fragment)
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.mainContainer, fragment).commitAllowingStateLoss()
    }

    override fun onBackPressed() {
        when(fragmentType){
            MainFragmentType.SING_UP->{
                repository.changeMainFragment(MainFragmentType.SING_IN)
            }
            MainFragmentType.PROFILE->{
                repository.changeMainFragment(MainFragmentType.INFO)
            }
            else -> {}
        }
    }
}