package com.sum.recyleviewexample

import android.widget.ImageView
import androidx.databinding.BindingAdapter

class DataBindingAdapter {
    companion object{
        @JvmStatic  @BindingAdapter("imageResource")
        fun setImageResource(imageView: ImageView, resource:Int){
            imageView.setImageResource(resource)
        }
    }
}