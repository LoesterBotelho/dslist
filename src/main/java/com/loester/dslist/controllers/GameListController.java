package com.loester.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loester.dslist.dto.GameListDTO;
import com.loester.dslist.dto.GameMinDTO;
import com.loester.dslist.services.GameListService;
import com.loester.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gamesListService;

	@Autowired
	private GameService gamesService;
	
	@GetMapping
	public List<GameListDTO> findAll(){		
		return gamesListService.findAll();	
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findById(@PathVariable Long listId){		
		return gamesService.findByList(listId);		
	}
	
}
