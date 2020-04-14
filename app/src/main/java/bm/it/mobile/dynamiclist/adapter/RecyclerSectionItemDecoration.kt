package bm.it.mobile.dynamiclist.adapter

import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import bm.it.mobile.dynamiclist.R
import bm.it.mobile.library.dynamicList.SectionCallback
import bm.it.mobile.library.dynamicList.adapter.view.BaseRecyclerSectionItemDecoration

class RecyclerSectionItemDecoration(listener: SectionCallback) :
    BaseRecyclerSectionItemDecoration(listener) {

    override fun getHeaderViewForItem(headerPosition: Int, parent: RecyclerView): View {
        val header: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_dynamic_header, parent, false)

        val textView = header.findViewById<TextView>(R.id.header)
        textView.apply {
            text = (parent.adapter as SectionCallback).getHeader(headerPosition)
        }
        return header
    }
}