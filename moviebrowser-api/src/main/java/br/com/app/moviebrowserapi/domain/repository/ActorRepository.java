package br.com.app.moviebrowserapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.app.moviebrowserapi.domain.entities.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

}
