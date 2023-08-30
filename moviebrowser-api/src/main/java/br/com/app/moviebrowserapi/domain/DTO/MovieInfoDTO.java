package br.com.app.moviebrowserapi.domain.DTO;

import java.util.Date;
import java.util.List;

import br.com.app.moviebrowserapi.domain.entities.Actor;
import br.com.app.moviebrowserapi.domain.entities.Genre;

public class MovieInfoDTO {

    private String name;
    private String description;
    private Date releaseDate;
    private String duration;
    private List<Genre> genres;
    private String budget;
    private Double rating;
    private String logo;
    private List<Actor> cast;

    public MovieInfoDTO(String name, String description, Date releaseDate, String duration, List<Genre> genres, String budget, Double rating, String logo) {
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.genres = genres;
        this.budget = budget;
        this.rating = rating;
        this.logo = logo;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<Actor> getCast() {
        return cast;
    }

    public void setCast(List<Actor> cast) {
        this.cast = cast;
    }
}
