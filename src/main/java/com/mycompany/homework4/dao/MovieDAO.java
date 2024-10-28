package com.mycompany.homework4.dao;

import com.mycompany.homework4.model.Movie;

import java.util.List;

public interface MovieDAO {
    void addMovie(Movie movie);
    List<Movie> getAllMovies();
    List<Movie> searchMovies(String keyword);
}
