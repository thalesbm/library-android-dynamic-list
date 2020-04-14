package bm.it.mobile.dynamiclist.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bm.it.mobile.dynamiclist.model.DynamicListModel
import bm.it.mobile.library.dynamicList.SectionCallback
import bm.it.mobile.library.dynamicList.adapter.BaseDynamicListAdapter

class ListStatementAdapter(list: List<DynamicListModel>) :
    BaseDynamicListAdapter<DynamicListModel>(list), SectionCallback {

    override fun getHeader(itemPosition: Int): String {
        return list[itemPosition].header
    }

    override fun isHeader(position: Int): Boolean {
        return list[position].isHeader
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return super.onCreateViewHolder(
            viewType,
            ItemViewHolder(parent),
            HeaderViewHolder(parent)
        )
    }
}