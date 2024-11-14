package com.loester.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loester.dslist.dto.GameDTO;
import com.loester.dslist.dto.GameMinDTO;
import com.loester.dslist.entities.Game;
import com.loester.dslist.repositories.GameRepository;



@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map( x -> new GameMinDTO(x) ).toList();		
	}
}
