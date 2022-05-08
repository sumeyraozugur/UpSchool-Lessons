package com.sum.myapplication2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.sum.myapplication2.databinding.FragmentEightBinding


class EightFragment : Fragment() {
    private lateinit var fragmentEightBinding: FragmentEightBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        fragmentEightBinding =DataBindingUtil.inflate(inflater,R.layout.fragment_eight,container,false)
        return fragmentEightBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentEightBinding.button8.setOnClickListener {
            findNavController().navigate(R.id.action_eightFragment_to_firstFragment)
        }
    }


}