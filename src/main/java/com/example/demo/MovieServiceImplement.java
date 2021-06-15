package com.example.demo;


import com.example.demo.dto.*;
import com.example.demo.repos.MovieRep;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MovieServiceImplement implements MovieService {

    @Autowired
    MovieRep movieRep;


    @Override
    public GetMovieOut getMovie() {
        return null;
    }

    @Override
    public GetMoviesOut getMovies() {
        List<Movie> movieList = new ArrayList<>();
        GetMoviesOut getMoviesOutput = new GetMoviesOut();

        List<MovieDTO> movieDTOList = new ArrayList<>();

        for (Movie movie : movieList) {
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setId(movie.getId());
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());
            movieDTOList.add(movieDTO);
        }

        getMoviesOutput.setMovieDTOList(movieDTOList);
        return getMoviesOutput;
    }

    @Override
    public void addMovie(AddMovieOut addMovie) {
        Movie movie = new Movie();
        movie.setTitle(addMovie.getTitle());
        movie.setCountry((addMovie.getCountry()));
        movieRep.save(movie);
    }

    @Override
    public void deleteMovie(DeleteMovie deleteMovieInput) {
        movieRep.deleteById(deleteMovieInput.getId());
    }

    @Override
    public GetMovieOut getMovie(GetMovieIn getMovieIn) {
        GetMovieOut getMovieOutput = new GetMovieOut();
        getMovieOutput.setId(getMovieIn.getId());
        getMovieOutput.setTitle(getMovieOutput.getTitle());
        getMovieOutput.setCountry(getMovieOutput.getCountry());
        return getMovieOutput;
    }
}