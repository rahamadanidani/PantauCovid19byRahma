package id.rahma.dani.covid19.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class InfoCountry(
        // data object dengan array menurut respond dari api
    val Deaths:String?,
    val Confirmed:String?,
    val Recovered:String?,
    val Active:String?,
    val Date:String?
):Parcelable{
    constructor(): this("","","",
    "","")
}
