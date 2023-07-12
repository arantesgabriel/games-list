package com.devsuperior.gameslist.services;

import com.devsuperior.gameslist.DTO.GameDTO;
import com.devsuperior.gameslist.entities.Game;
import com.devsuperior.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<GameDTO> searchGames() {
        List<Game> gameSearch = gameRepository.findAll();
        return gameSearch.stream().map(GameDTO::new).toList();
    }

}
