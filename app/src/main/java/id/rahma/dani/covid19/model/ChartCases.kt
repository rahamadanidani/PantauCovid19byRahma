package id.rahma.dani.covid19.model

import com.github.mikephil.charting.data.Entry

data class ChartCases(
        // data array dengan object menurut respond dari api
    val dataConfirmed: ArrayList<Entry>,
    val dataRecovered: ArrayList<Entry>,
    val dataActive: ArrayList<Entry>,
    val dataDeaths: ArrayList<Entry>,
    val dateCases: ArrayList<String>
)
