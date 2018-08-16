package com.demo.model
import com.google.gson.annotations.SerializedName




data class ResponseModels(
    @SerializedName("records") val records: List<Record>
)

data class Record(
    @SerializedName("Name") val name: String? = "",
    @SerializedName("City") val city: String? = "",
    @SerializedName("Country") val country: String? = ""
)