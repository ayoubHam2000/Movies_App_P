package com.example.app6.Classes

import java.util.*
import kotlin.collections.ArrayList

// video = (titre, story, starts, image,trealer, gotham, date, langue, xarika, genre, duree)
// rating (id_user, id_film, rating) -> trigger
class Movie(
    val id : Int,
    val name : String,
) {
    //alt + shift
    var story : String? = null
    var rating : String? = null
    var imageUrl : String? = null
    var trailerUrl : String? = null
    var releaseDate : Date? = null
    var language : String? = null
    var productionStudio : String? = null
    var genre : ArrayList<String>? = null
    var runningTime : Int? = null //sec
    var budget : Int? = null
}