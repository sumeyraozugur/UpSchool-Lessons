package com.sum.myapplication

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException


class DialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage("This dialog title").setPositiveButton(
                "Ok",DialogInterface.OnClickListener{ dialog, id ->

                }).setNegativeButton("Cancel",DialogInterface.OnClickListener{
                    dialogInterface, i ->
            })
            builder.create()
        }?: throw  IllegalStateException("Activity cannot be null")
    }




}