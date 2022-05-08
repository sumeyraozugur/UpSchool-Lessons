package com.sum.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BlankFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("AKBANK","onCreate(1) called")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        Log.v("AKBANK","onCreateView(2) called")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.v("AKBANK","onViewCreated(3) called")

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.v("AKBANK","onAttach called")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.v("AKBANK","onViewStateRestored(4) called")

    }

    override fun onStart() {
        super.onStart()
        Log.v("AKBANK","onStart(5) called")

    }

    override fun onResume() {
        super.onResume()
        Log.v("AKBANK","onResume(6) called")

    }

    override fun onPause() {
        super.onPause()
        Log.v("AKBANK","onPause(7) called")
    }

    override fun onStop() {
        super.onStop()
        Log.v("AKBANK","onStop(8) called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.v("AKBANK","onSaveInstanceState(9) called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.v("AKBANK","onDestroyView(10) called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("AKBANK","onDestroy(11) called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.v("AKBANK","onDetach called")
    }






}