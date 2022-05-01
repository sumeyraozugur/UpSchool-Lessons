package com.sum.recyleviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

import androidx.recyclerview.widget.GridLayoutManager
import com.sum.recyleviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val list =ArrayList<ClothesModel>()
        list.add(ClothesModel("Fit and Flare","120.99",R.drawable.clothes1))
        list.add(ClothesModel("Empire Dress","136.00",R.drawable.clothes2))
        list.add(ClothesModel("Summer Vibes","199.99",R.drawable.clothes3))
        list.add(ClothesModel("Flora Fun","150.99",R.drawable.clothes4))

        val adapter = ClothesAdapter(list)
        val gridLayoutManager= GridLayoutManager(this,2)
        activityMainBinding.recyclerView.layoutManager = gridLayoutManager
        activityMainBinding.setVariable(BR.adapter, adapter)


    }
}