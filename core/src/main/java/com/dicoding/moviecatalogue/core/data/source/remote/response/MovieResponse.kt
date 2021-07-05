package com.dicoding.moviecatalogue.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("overview")
    val overview: String,

    @field:SerializedName("poster_path")
    val poster_path: String,

    @field:SerializedName("release_date")
    val release_date: String,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("vote_average")
    val vote_average: Double,
)