package com.sum.recyleviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.sum.recyleviewexample.databinding.ItemClothesBinding

class ClothesAdapter(val list:List<ClothesModel>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val clothesBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), R.layout.item_clothes, parent, false
        )
        return ClothesViewHolder(clothesBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ClothesViewHolder).onBind((list.get(position )))
    }

    override fun getItemCount(): Int {
        return list.size

    }
    class ClothesViewHolder(val clothesBinding: ViewDataBinding):RecyclerView.ViewHolder(clothesBinding.root) {
        fun onBind(clothesModel: ClothesModel) {
            val binding = clothesBinding as ItemClothesBinding
            binding.setVariable(BR.itemclothes, clothesModel)

        }


    }
}