package com.task.scopic.utils.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.task.scopic.R
import com.task.scopic.modles.Item
import com.task.scopic.utils.extension.afterTextChanged
import com.task.scopic.utils.extension.capitalizeFirstLater
import com.task.scopic.utils.extension.trimSpace

class DialogHelper {

    fun showErrorDialog(context: Context,massage:String){
       val dialog = Dialog(context, R.style.my_dialog)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.requestFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT)
        dialog.window?.setGravity(Gravity.CENTER)
        dialog.setContentView(R.layout.dialog_error)
        val dialogOk = dialog.findViewById<AppCompatTextView>(R.id.dialogOk)
        val dialogMassage = dialog.findViewById<AppCompatTextView>(R.id.dialogMassage)
        dialogMassage.text =massage
        dialogOk.setOnClickListener { dialog.dismiss() }
        dialog.show()
    }


    fun showAddDialog(context: Context, iAddDialogCallBack: IAddDialogCallBack) {
        val dialog = Dialog(context, R.style.my_dialog)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.requestFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT
        )
        dialog.window?.setGravity(Gravity.CENTER)
        dialog.setContentView(R.layout.dialog_add)

        val addTitleET: AppCompatEditText = dialog.findViewById(R.id.addTitle)
        val letterCount: AppCompatTextView = dialog.findViewById(R.id.letterCount)
        val ok: AppCompatTextView = dialog.findViewById(R.id.dialogAddOk)
        val cancel: AppCompatTextView = dialog.findViewById(R.id.dialogAddCancel)


        val okClick = View.OnClickListener {
           var title= addTitleET.text.toString()
            title.trimStart().also { title = it }
            title.trimEnd().also { title = it }
            title.trimSpace().also { title = it }
            title.capitalizeFirstLater().also { title = it }
            iAddDialogCallBack.add(Item(title))
            dialog.dismiss()
        }


        cancel.setOnClickListener { dialog.dismiss() }

        addTitleET.afterTextChanged {
            letterCount.text = "${it.length}/40"
            if(it.isNotEmpty() && it.length<=40){
                letterCount.setTextColor(ContextCompat.getColor(context, R.color.black))
                ok.setOnClickListener(okClick)
                ok.setBackgroundResource(R.drawable.shape_ok_enable)
            }else{
                letterCount.setTextColor(ContextCompat.getColor(context, R.color.red))
                ok.setOnClickListener(null)
                ok.setBackgroundResource(R.drawable.shape_ok_disable)
            }
        }
        dialog.show()
    }

}