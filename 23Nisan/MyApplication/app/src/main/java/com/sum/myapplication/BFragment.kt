package com.sum.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs


class BFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val args: BFragmentArgs by navArgs()
        Log.v("BFragmentArgs",args.mynumber.toString())

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }


}