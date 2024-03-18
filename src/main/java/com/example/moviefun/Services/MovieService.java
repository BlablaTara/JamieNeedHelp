package com.example.moviefun.Services;

import com.example.moviefun.Models.Movie;
import com.example.moviefun.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;


    public List<Movie> getMovies(){
        return movieRepository.getMovies();
    }

}
