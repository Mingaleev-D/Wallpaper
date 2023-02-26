package com.example.wallpaper.data.model.photo


import com.google.gson.annotations.SerializedName

data class Social(
    @SerializedName("instagram_username")
    val instagramUsername: Any,
    @SerializedName("paypal_email")
    val paypalEmail: Any,
    @SerializedName("portfolio_url")
    val portfolioUrl: String,
    @SerializedName("twitter_username")
    val twitterUsername: Any
)