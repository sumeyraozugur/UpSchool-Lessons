package com.sum.myapplication2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.sum.myapplication2.databinding.FragmentFourthBinding


class FourthFragment : Fragment() {
    private lateinit var fragmentFourthBinding: FragmentFourthBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        fragmentFourthBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_fourth, container, false)
        return fragmentFourthBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentFourthBinding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_fourthFragment_to_fiveFragment)
        }
    }


}