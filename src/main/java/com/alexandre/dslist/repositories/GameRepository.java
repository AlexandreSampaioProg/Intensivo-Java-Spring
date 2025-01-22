package com.alexandre.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandre.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
