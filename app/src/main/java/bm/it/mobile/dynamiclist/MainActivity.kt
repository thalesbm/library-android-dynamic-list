package bm.it.mobile.dynamiclist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import bm.it.mobile.dynamiclist.adapter.ListStatementAdapter
import bm.it.mobile.dynamiclist.adapter.RecyclerSectionItemDecoration
import bm.it.mobile.dynamiclist.model.DynamicListModel
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ListStatementAdapter(createList())

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(RecyclerSectionItemDecoration(adapter))
        }
        recyclerView.adapter = adapter
    }

    private fun createList(): List<DynamicListModel> {
        val list: MutableList<DynamicListModel> =
            ArrayList()

        for (i in 0..9) {
            val header = DynamicListModel()
            header.header = "header $i"
            header.isHeader = true
            list.add(header)

            for (j in 0..6) {
                val item = DynamicListModel()
                item.isHeader = false
                item.header = "header $i"
                item.value = "value $j"
                item.description = "description $j"
                list.add(item)
            }
        }
        return list
    }
}
