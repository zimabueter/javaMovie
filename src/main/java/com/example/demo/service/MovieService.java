package com.example.demo.service;

import com.example.demo.dto.AddMovieOut;
import com.example.demo.dto.DeleteMovie;
import com.example.demo.dto.GetMovieOut;
import com.example.demo.dto.GetMoviesOut;

public interface MovieService {
    void addMovie(AddMovieOut addMovieOut);

    GetMovieOut getMovie();

    GetMoviesOut getMovies();

    void deleteMovie(DeleteMovie deleteMovie);
}