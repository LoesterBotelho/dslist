package com.loester.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loester.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
