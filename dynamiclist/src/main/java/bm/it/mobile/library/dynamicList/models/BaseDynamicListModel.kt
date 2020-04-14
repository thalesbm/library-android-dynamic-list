package bm.it.mobile.library.dynamicList.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
open class BaseDynamicListModel : Parcelable {
    var isHeader = false
}
