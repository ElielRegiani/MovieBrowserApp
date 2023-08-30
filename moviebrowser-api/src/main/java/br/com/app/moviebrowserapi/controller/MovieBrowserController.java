package br.com.app.moviebrowserapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.moviebrowserapi.domain.DTO.MovieDTO;
import br.com.app.moviebrowserapi.domain.entities.User;
import br.com.app.moviebrowserapi.service.MovieService;

@RestController
@RequestMapping(name = "/")
public class MovieBrowserController {

    @Autowired
    MovieService movieService;

    @GetMapping("movieslist/{userId}")
    public List<MovieDTO> getUserMovieList(@PathVariable Long userId) {
        User user = new User();
        List<MovieDTO> movieDTOList = new ArrayList<>();
        movieService.getUserMovies(user).forEach(movie -> movieDTOList.add(movie.toMovieDTO()));
        return movieDTOList;
    }

    @GetMapping("/{userId}/movieslist/{movieName}")
    public List<MovieDTO> getUserByMovieName(@PathVariable Long userId, @PathVariable String movieName) {
        User user = new User();
        List<MovieDTO> movieDTOList = new ArrayList<>();
        movieService.getUserMovies(user).forEach(movie -> movieDTOList.add(movie.toMovieDTO()));
        return movieDTOList;
    }

    @GetMapping("/{userId}/movieslist")
    public List<MovieDTO> getUser(@PathVariable Long userId) {
        User user = new User();
        List<MovieDTO> movieDTOList = new ArrayList<>();
        movieService.getUserMovies(user).forEach(movie -> movieDTOList.add(movie.toMovieDTO()));
        return movieDTOList;
    }
}
