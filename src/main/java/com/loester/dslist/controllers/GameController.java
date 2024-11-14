package com.loester.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loester.dslist.dto.GameDTO;
import com.loester.dslist.dto.GameMinDTO;
import com.loester.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gamesService;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){		
		return gamesService.findById(id);				
	}
	
	@GetMapping
	public List<GameMinDTO> findAll(){		
		return gamesService.findAll();	
	}
	
}
