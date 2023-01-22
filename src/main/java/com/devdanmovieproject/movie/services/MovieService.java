package com.devdanmovieproject.movie.services;

import com.devdanmovieproject.movie.model.Movie;
import com.devdanmovieproject.movie.model.Review;
import com.devdanmovieproject.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies(){
        return  movieRepository.findAll();

    }

    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
