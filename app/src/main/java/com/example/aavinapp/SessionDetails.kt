package com.example.aavinapp

import androidx.annotation.Keep
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class SessionDetails(
    var username: String,
    var sessionId: String,
    var deviceDetails: String
)
