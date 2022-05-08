package com.sum.myapplication2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.sum.myapplication2.databinding.FragmentFiveBinding


class FiveFragment : Fragment() {
    private lateinit var fragmentFiveBinding:FragmentFiveBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        fragmentFiveBinding =DataBindingUtil.inflate(inflater,R.layout.fragment_five, container, false)
        return fragmentFiveBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentFiveBinding.button5.setOnClickListener {
            findNavController().navigate(R.id.action_fiveFragment_to_sixFragment)
        }
    }

}