package com.example.controller;

import com.example.games.Game;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoGamesController {

    @RequestMapping("/games")
    public String allGames(Model model) {
        model.addAttribute("games", getAllGames());
        return "allGames";
    }

    @RequestMapping("/games/{title}")
    public String getGame(@PathVariable(value="title") String title, Model model) {
        List<Game> games = getAllGames();

        Game matchingGame = games.stream()
                                 .filter(game -> title.equals(game.getTitle()))
                                 .findFirst()
                                 .get();


        model.addAttribute("game", matchingGame);
        return "findGameByTitle";
    }


    private List<Game> getAllGames() {
        List<Game> games = new ArrayList<Game>();

        Game game1 = new Game("Legend of Zelda", "1999", false);
        Game game2 = new Game("Super Smash Bros", "1998", true);
        Game game3 = new Game("Goldeneye", "1999", true);
        Game game4 = new Game("ChronoTrigger", "1997", false);

        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);

        return games;
    }
}
