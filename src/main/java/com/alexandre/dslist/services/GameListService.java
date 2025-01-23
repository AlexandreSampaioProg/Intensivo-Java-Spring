package com.alexandre.dslist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandre.dslist.dto.GameListDTO;
import com.alexandre.dslist.entities.GameList;
import com.alexandre.dslist.repositories.GameListRepository;



@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true) //não irá bloquear o banco de dados para escrita
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList(); //transforma a lista de games em uma lista de games DTO
		return dto;
	}
	
}
