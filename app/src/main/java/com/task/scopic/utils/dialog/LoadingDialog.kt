package com.task.scopic.utils.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.Window
import android.view.WindowManager
import com.github.loadingview.LoadingView
import com.task.scopic.R

class LoadingDialog(context: Context ):Dialog(context,R.style.my_dialog) {
    init {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.setCancelable(true)
        this.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        this.window?.requestFeature(Window.FEATURE_NO_TITLE)
        this.window?.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT)
        this.window?.setGravity(Gravity.CENTER)
        this.setContentView(R.layout.dialog_loading)
    }
   private val loader = this.findViewById<LoadingView>(R.id.loader)

    override fun show() {
        super.show()
        loader.start()
    }

    override fun dismiss() {
        loader.stop()
        super.dismiss()
    }
}