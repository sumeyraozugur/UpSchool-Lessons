package com.sum.myapplication2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.sum.myapplication2.databinding.FragmentSevenBinding


class SevenFragment : Fragment() {
    private lateinit var fragmentSevenBinding: FragmentSevenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        fragmentSevenBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_seven, container,false)
        return fragmentSevenBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentSevenBinding.button7.setOnClickListener {
            findNavController().navigate(R.id.action_sevenFragment_to_eightFragment)
        }
    }

}