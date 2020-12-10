package com.example.kmm_t.shared.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("id")
    val id:Int?,
    @SerialName("balance")
    val balance:Float?,
    @SerialName("promoCode")
    val promoCode:String?,
    @SerialName("countReferrers")
    val countReferrers:Int?,
    @SerialName("sumRewardForReferrers")
    val sumRewardForReferrers:Float?
)