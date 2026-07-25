package com.cinesphere.cinesphere.movie.service;

import com.cinesphere.cinesphere.common.exception.MovieNotFoundException;
import com.cinesphere.cinesphere.movie.model.Movie;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private final List<Movie> movies = new ArrayList<>();
    public List<Movie> getAllMovies(){
        return movies;
    }

    public Movie getMovieById(Long id){
        return movies.stream().filter(movie -> movie.getId().equals(id))
                .findFirst().orElseThrow(()-> new MovieNotFoundException(id));
    }

    @PostConstruct
    public void loadSampleMovies(){
        movies.add(
                new Movie(1L, "Interstellar", "A science fiction movie about space and time.",
                        "English")
        );

        movies.add(
                new Movie(2L, "3 Idiots",
                        "A story about friendship and engineering college life.","Hindi")
        );
    }
}
