package bm.it.mobile.library.dynamicList.adapter

import androidx.recyclerview.widget.RecyclerView
import bm.it.mobile.library.dynamicList.SectionCallback
import bm.it.mobile.library.dynamicList.adapter.view.BaseHeaderViewHolder
import bm.it.mobile.library.dynamicList.adapter.view.BaseItemViewHolder

abstract class BaseDynamicListAdapter<T>(protected var list: List<T>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(), SectionCallback {

    private val ITEM_VIEW = 0
    private val HEADER_VIEW = 1

    protected abstract fun isHeader(position: Int): Boolean

    protected fun onCreateViewHolder(
        viewType: Int,
        itemViewHolder: BaseItemViewHolder<T>,
        headerViewHolder: BaseHeaderViewHolder<T>
    ): RecyclerView.ViewHolder {
        var viewHolder: RecyclerView.ViewHolder? = null
        when (viewType) {
            ITEM_VIEW -> viewHolder = itemViewHolder
            HEADER_VIEW -> viewHolder = headerViewHolder
        }
        return viewHolder!!
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewType = getItemViewType(position)
        when (viewType) {
            ITEM_VIEW -> {
                val item: T = list[position]
                if (item != null) {
                    val itemViewHolder = holder as BaseItemViewHolder<T>
                    itemViewHolder.bind(item)
                }
            }
            HEADER_VIEW -> {
                val header: T = list[position]
                if (header != null) {
                    val headerViewHolder =
                        holder as BaseHeaderViewHolder<T>
                    headerViewHolder.bind(header, position)
                }
            }
        }
    }

    override fun getHeaderPositionForItem(itemPosition: Int): Int {
        var position = itemPosition
        var headerPosition = if (list.isEmpty()) 0 else 1
        do {
            if (isHeader(position)) {
                if (position != 0) {
                    headerPosition = position
                    break
                }
            }
            position -= 1
        } while (position >= 0)
        return headerPosition
    }

    override fun checkHeader(itemPosition: Int): Boolean {
        return list.isNotEmpty() && isHeader(itemPosition)
    }

    override fun getItemViewType(position: Int): Int {
        return if (list.isNotEmpty() && isHeader(position)) {
            HEADER_VIEW
        } else {
            ITEM_VIEW
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}