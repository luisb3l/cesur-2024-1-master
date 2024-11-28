package com.cinexpress.videofriend.services;

import com.cinexpress.videofriend.models.Movie;

public interface MovieService {
    void addMovie(Movie movie);
    Movie updateMovie(Long id, Movie move);
    void updateAvailability(Movie movie);
    Movie getMovieById(Long id);
    Movie createMovie(Movie movie);
    void deleteMovie(Long id);
}
