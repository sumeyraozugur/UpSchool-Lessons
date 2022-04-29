package com.sum.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController


class AFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button:Button = view.findViewById(R.id.button)
        button.setOnClickListener {
            //findNavController().navigate(R.id.action_AFragment_to_dialogFragment)
           // findNavController().navigate(R.id.action_AFragment_to_loginActivity)
            //startActivity(Intent(context, LoginActivity::class.java))//ıntentle de gönderebilirsin ama nav kullanman daha doğru.
            findNavController().navigate(R.id.action_AFragment_to_loginActivity,bundleOf("user" to "sumeyra"))
          //  findNavController().navigate(R.id.action_AFragment_to_nav_start,bundleOf("user" to "sumeyra"))
           // findNavController().navigate(R.id.BFragment)
        }

    }


}