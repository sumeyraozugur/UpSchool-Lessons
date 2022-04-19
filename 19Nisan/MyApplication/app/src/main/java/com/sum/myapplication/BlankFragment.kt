package com.sum.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.sum.myapplication.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    private lateinit var  buton: Button
    private  lateinit var fragmentBlankBinding: FragmentBlankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
       // val view = inflater.inflate(R.layout.fragment_blank,container)
        fragmentBlankBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_blank,container,false)
       // return view
        return fragmentBlankBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      /* buton = view.findViewById(R.id.btnClick)
        buton.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_blankFragment2)
        }

       */
        fragmentBlankBinding.btnClick.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_blankFragment2)
        }
    }


}