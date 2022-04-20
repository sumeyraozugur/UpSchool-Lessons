package com.sum.myapplication2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.sum.myapplication2.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private lateinit var  fragmentThirdBinding: FragmentThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        fragmentThirdBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_third, container, false)
        return fragmentThirdBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentThirdBinding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_fourthFragment)
        }
    }


}