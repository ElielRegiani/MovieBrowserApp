package br.com.app.moviebrowserapi.domain.DTO;

import java.util.List;

import br.com.app.moviebrowserapi.domain.entities.Genre;

public class MovieDTO {

    private String name;
    private List<Genre> genres;
    private Double rating;

    public MovieDTO(String name, List<Genre> genres, Double rating) {
        this.name = name;
        this.genres = genres;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
