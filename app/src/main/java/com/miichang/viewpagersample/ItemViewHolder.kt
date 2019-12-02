package com.miichang.viewpagersample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.miichang.viewpagersample.databinding.ViewChristmasBinding

internal class ItemViewHolder(
    itemView: View,
    private val binding: ViewChristmasBinding
) : RecyclerView.ViewHolder(itemView) {
    companion object {
        fun create(
            inflater: LayoutInflater,
            container: ViewGroup,
            attachToRoot: Boolean
        ): ItemViewHolder {
            val binding = ViewChristmasBinding.inflate(inflater, container, attachToRoot)
            return ItemViewHolder(binding.root, binding)
        }
    }

    fun bind(item: Christmas) {
        binding.apply {
            christmas = item
            executePendingBindings()
        }
    }
}