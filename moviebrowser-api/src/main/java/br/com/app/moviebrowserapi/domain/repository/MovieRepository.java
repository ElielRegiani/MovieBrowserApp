package br.com.app.moviebrowserapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.app.moviebrowserapi.domain.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
