package bm.it.mobile.library.dynamicList.adapter.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseItemViewHolder<T>(var parent: ViewGroup, layout: Int) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(layout, parent, false)
    ) {

    protected abstract fun init()

    open fun bind(t: T) {}

    init {
        init()
    }
}