package com.task.scopic.app


import com.task.scopic.data.db.RealmHelper
import com.task.scopic.data.firebase.FirestoreHelper
import com.task.scopic.data.firebase.MyFirebaseAuth
import com.task.scopic.ui.main.fragments.singin.SingInFragment
import com.task.scopic.ui.main.fragments.singin.SingInViewModel
import com.task.scopic.ui.main.fragments.singup.SingUpFragment
import com.task.scopic.ui.main.fragments.singup.SingUpViewModel
import com.task.scopic.ui.main.MainViewModel
import com.task.scopic.ui.main.fragments.info.InfoFragment
import com.task.scopic.ui.main.fragments.profile.ProfileFragment
import com.task.scopic.ui.main.fragments.profile.ProfileViewModel
import com.task.scopic.ui.main.fragments.welcome.WelcomeFragment
import com.task.scopic.ui.main.fragments.info.InfoViewModel
import com.task.scopic.utils.dialog.DialogHelper
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {

//Singleton
    single { Repository(get(),get(),get()) }
    single { FirestoreHelper() }
    single { MyFirebaseAuth() }
    single { RealmHelper(get()) }
    single { DialogHelper() }

    //fragments
    factory { SingInFragment(get(),get(),get()) }
    factory { SingUpFragment(get(),get(),get()) }
    factory { WelcomeFragment(get()) }
    factory { InfoFragment(get(),get(),get()) }
    factory { ProfileFragment(get(),get(),get()) }


    viewModel { SingInViewModel(get()) }
    viewModel { SingUpViewModel(get()) }
    viewModel { MainViewModel(get()) }
    viewModel { InfoViewModel(get()) }
    viewModel { ProfileViewModel(get()) }
}