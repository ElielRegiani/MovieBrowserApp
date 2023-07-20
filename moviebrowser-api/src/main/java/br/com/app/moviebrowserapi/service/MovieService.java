package br.com.app.moviebrowserapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.app.moviebrowserapi.domain.entities.Movie;
import br.com.app.moviebrowserapi.domain.entities.User;
import br.com.app.moviebrowserapi.domain.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getUserMovies(User user) {
        return movieRepository.getMoviesByUsername(user.getName());
    }
}
