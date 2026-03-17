package com.example.myapplication.data.model

/**
 * Clase movie
 *
 * @author Adrian
 */
data class Movie(
    val id: Int,
    val title: String,
    val posterUrl: String,
    val rating: Double,
    var isFavourite: Boolean = false
)
