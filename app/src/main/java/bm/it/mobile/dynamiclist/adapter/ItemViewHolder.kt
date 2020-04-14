package bm.it.mobile.dynamiclist.adapter

import android.view.ViewGroup
import android.widget.TextView
import bm.it.mobile.dynamiclist.R
import bm.it.mobile.dynamiclist.model.DynamicListModel
import bm.it.mobile.library.dynamicList.adapter.view.BaseItemViewHolder

class ItemViewHolder(parent: ViewGroup) :
    BaseItemViewHolder<DynamicListModel>(parent, R.layout.adapter_dynamic_item) {

    private var mTextDescription: TextView? = null
    private var mTextPrice: TextView? = null

    override fun init() {
        mTextDescription = itemView.findViewById(R.id.description)
        mTextPrice = itemView.findViewById(R.id.price)
    }

    override fun bind(model: DynamicListModel) {
        super.bind(model)

        mTextDescription?.apply {
            text = model.description
        }

        mTextPrice?.apply {
            text = model.value
        }
    }
}