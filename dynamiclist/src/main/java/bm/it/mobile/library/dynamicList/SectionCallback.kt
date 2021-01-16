package bm.it.mobile.library.dynamicList

interface SectionCallback {

    fun getHeaderPositionForItem(itemPosition: Int): Int
    fun checkHeader(itemPosition: Int): Boolean
    fun getHeader(itemPosition: Int): String
    fun getHeaderSubTitle(itemPosition: Int): String
}
