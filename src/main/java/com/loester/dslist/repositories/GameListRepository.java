package com.loester.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loester.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
