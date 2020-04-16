package bm.it.mobile.dynamiclist.adapter

import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import bm.it.mobile.dynamiclist.R
import bm.it.mobile.dynamiclist.model.DynamicListModel
import bm.it.mobile.library.dynamicList.adapter.view.BaseItemViewHolder

class ItemViewHolder(parent: ViewGroup) :
    BaseItemViewHolder<DynamicListModel>(parent, R.layout.adapter_dynamic_item) {

    private var mTextDescription: AppCompatTextView? = null
    private var mTextPrice: AppCompatTextView? = null

    override fun init() {
        mTextDescription = itemView.findViewById(R.id.description)
        mTextPrice = itemView.findViewById(R.id.price)
    }

    override fun bind(item: DynamicListModel) {
        super.bind(item)

        mTextDescription?.apply {
            text = item.description
        }

        mTextPrice?.apply {
            text = item.value
        }
    }
}