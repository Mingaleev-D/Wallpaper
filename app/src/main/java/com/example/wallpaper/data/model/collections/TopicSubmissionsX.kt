package com.example.wallpaper.data.model.collections


import com.google.gson.annotations.SerializedName

data class TopicSubmissionsX(
    @SerializedName("architecture-interior")
    val architectureInterior: ArchitectureInteriorX,
    @SerializedName("arts-culture")
    val artsCulture: ArtsCultureX,
    @SerializedName("business-work")
    val businessWork: BusinessWork,
    @SerializedName("color-of-water")
    val colorOfWater: ColorOfWater,
    @SerializedName("current-events")
    val currentEvents: CurrentEvents,
    @SerializedName("health")
    val health: HealthX,
    @SerializedName("nature")
    val nature: Nature,
    @SerializedName("spirituality")
    val spirituality: Spirituality,
    @SerializedName("textures-patterns")
    val texturesPatterns: TexturesPatterns,
    @SerializedName("wallpapers")
    val wallpapers: Wallpapers
)