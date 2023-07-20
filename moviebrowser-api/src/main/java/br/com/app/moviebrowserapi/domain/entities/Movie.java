package br.com.app.moviebrowserapi.domain.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.app.moviebrowserapi.domain.DTO.MovieDTO;
import br.com.app.moviebrowserapi.domain.DTO.MovieInfoDTO;

@Entity
@Table(name = "movie")
public class Movie {

    private Long id;
    private String name;
    private String description;
    private Date releaseDate;
    private String duration;
    private List<Genre> genres;
    private String budget;
    private Double rating;
    private MovieStatus status;
    private String logo;
    private List<Actor> cast;
    private User user;

    public Movie(String name, String description, Date releaseDate, String duration, List<Genre> genres, String budget, Double rating, MovieStatus status, String logo, List<Actor> cast, User user) {
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.genres = genres;
        this.budget = budget;
        this.rating = rating;
        this.status = status;
        this.logo = logo;
        this.cast = cast;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "movie_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "release_date")
    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Column(name = "duration")
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Column(name = "genres")
    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    @Column(name = "budget")
    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    @Column(name = "rating")
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Column(name = "movie_status")
    public MovieStatus getStatus() {
        return status;
    }

    public void setStatus(MovieStatus status) {
        this.status = status;
    }

    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @OneToMany(mappedBy = "cast", cascade = CascadeType.ALL)
    public List<Actor> getCast() {
        return cast;
    }

    public void setCast(List<Actor> cast) {
        this.cast = cast;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MovieDTO toMovieDTO() {
        return new MovieDTO(this.getName(), this.getGenres(), this.getRating());
    }

    public MovieInfoDTO toMovieInfoDTO(Movie movie) {
        return new MovieInfoDTO(this.getName(), this.getDescription(), this.getReleaseDate(),
                this.getDuration(), this.getGenres(), this.budget, this.getRating(), this.logo, this.cast);
    }
}
