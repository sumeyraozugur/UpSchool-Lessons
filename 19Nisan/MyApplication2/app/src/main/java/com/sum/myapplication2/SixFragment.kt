package com.sum.myapplication2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.sum.myapplication2.databinding.FragmentSixBinding


class SixFragment : Fragment() {
    private lateinit var fragmentSixBinding: FragmentSixBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        fragmentSixBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_six, container, false)
        return fragmentSixBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentSixBinding.button6.setOnClickListener {
            findNavController().navigate(R.id.action_sixFragment_to_sevenFragment)
        }
    }


}