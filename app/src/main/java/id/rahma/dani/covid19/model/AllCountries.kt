package id.rahma.dani.covid19.model

data class AllCountries(
        // data object menurut respond dari api
    val Global: World,
    val Countries: ArrayList<Countries>
)
