package com.alexandre.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.alexandre.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
