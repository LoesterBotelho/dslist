package com.loester.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loester.dslist.dto.GameListDTO;
import com.loester.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gamesListService;

	@GetMapping
	public List<GameListDTO> findAll(){		
		return gamesListService.findAll();	
	}
	
}
