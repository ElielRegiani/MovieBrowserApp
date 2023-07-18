package br.com.app.moviebrowserapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MovieBrowserController {

    @GetMapping(name = "/movieslist")
    public List<MovieDTO> getAllMovies() {



        return
    }
}
