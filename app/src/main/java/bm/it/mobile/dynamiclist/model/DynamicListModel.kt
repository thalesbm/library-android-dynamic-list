package bm.it.mobile.dynamiclist.model

import android.os.Parcelable
import bm.it.mobile.library.dynamicList.models.BaseDynamicListModel
import kotlinx.android.parcel.Parcelize

@Parcelize
class DynamicListModel : BaseDynamicListModel(), Parcelable {
    lateinit var header: String
    lateinit var description: String
    lateinit var value: String
}