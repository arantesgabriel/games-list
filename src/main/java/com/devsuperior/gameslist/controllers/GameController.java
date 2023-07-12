package com.devsuperior.gameslist.controllers;

import com.devsuperior.gameslist.DTO.GameDTO;
import com.devsuperior.gameslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Indica que essa classe será a responsável por tratar as requisições, enviar e receber as requisições web (HTTP).
@RestController
// Anotação que mapeia o a classe redirecionando para um ou mais endpoints dentro da API.
@RequestMapping("games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDTO> searchGames() {
        List<GameDTO> listGames = gameService.searchGames();
        return listGames;
    }

}
