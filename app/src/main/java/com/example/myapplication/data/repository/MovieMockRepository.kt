package com.example.myapplication.data.repository

import android.util.Log
import com.example.myapplication.data.model.Movie

/**
 * Clase MovieMockRepository
 * Devuelve peliculas hardcodeadas hasta tener datos reales
 */
class MovieMockRepository {

    fun getPopularMovies(): List<Movie> {
        val movies = mutableListOf(
            Movie(1, "Inception", "/poster_inception.jpg", 8.8),
            Movie(2, "Interstellar", "/poster_interstellar.jpg", 8.6),
            Movie(3, "The Matrix", "/poster_matrix.jpg", 8.7)
        )

        movies.apply {
            add(
                Movie(4, "Dune: Part Two", "/poster_dune2.jpg", 8.9)
            )
        }

        return movies
    }

    fun processSelectedMovie(movieId: Int?){
        movieId.let {
            val allMovies = getPopularMovies()

            val selectedMovie = allMovies.find { movie ->
                movie.id == movieId
            }

            /**
             * Log.d("ResultadoPelicula", selectedMovie?.title ?: "")
             */
        }
    }
}
