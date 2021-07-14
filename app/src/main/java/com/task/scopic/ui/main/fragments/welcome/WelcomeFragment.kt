package com.task.scopic.ui.main.fragments.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import com.task.scopic.R
import com.task.scopic.app.Repository
import com.task.scopic.ui.main.fragments.MainFragmentType

class WelcomeFragment(private val repository: Repository) : Fragment() {

    private lateinit var welcomeList: AppCompatTextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_welcome, container, false)
        welcomeList = view.findViewById(R.id.welcomeList)
        welcomeList.setOnClickListener {
            repository.changeMainFragment(MainFragmentType.INFO)
        }
        return view
    }


}