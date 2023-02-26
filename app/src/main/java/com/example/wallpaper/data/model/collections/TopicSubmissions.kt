package com.example.wallpaper.data.model.collections


import com.google.gson.annotations.SerializedName

data class TopicSubmissions(
    @SerializedName("architecture-interior")
    val architectureInterior: ArchitectureInterior,
    @SerializedName("arts-culture")
    val artsCulture: ArtsCulture,
    @SerializedName("athletics")
    val athletics: Athletics,
    @SerializedName("3d-renders")
    val dRenders: DRenders,
    @SerializedName("girls-vs-stereotypes")
    val girlsVsStereotypes: GirlsVsStereotypes,
    @SerializedName("health")
    val health: Health,
    @SerializedName("interiors")
    val interiors: Interiors
)