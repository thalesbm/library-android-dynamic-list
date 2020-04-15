package bm.it.mobile.dynamiclist.adapter

import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import bm.it.mobile.dynamiclist.R
import bm.it.mobile.dynamiclist.model.DynamicListModel
import bm.it.mobile.library.dynamicList.adapter.view.BaseHeaderViewHolder

class HeaderViewHolder(parent: ViewGroup) :
    BaseHeaderViewHolder<DynamicListModel>(parent, R.layout.adapter_dynamic_header) {

    private var mTextDate: AppCompatTextView? = null

    override fun init() {
        mTextDate = itemView.findViewById(R.id.header)
    }

    override fun bind(item: DynamicListModel, position: Int) {
        super.bind(item, position)

        mTextDate?.apply {
            text = item.header
        }
    }
}