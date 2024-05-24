package com.example.aavinapp

import androidx.annotation.Keep
import kotlinx.serialization.Serializable


@Keep
@Serializable
data class SessionDetails(
    var farmerID: String,
    var sessionID: String,
    var deviceDetail: String,
    var password: String?,
    var transactionID: String?,
)
