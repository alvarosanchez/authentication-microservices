package com.odobo.authentication.microservices

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import static org.springframework.web.bind.annotation.RequestMethod.GET

@SpringBootApplication
@RestController
class Application {

    List<Game> gamesRepository = [
        new Game(id: 1, name: 'Castle Builder', iconUrl: 'https://play.odobo.com/image/game/300/152x152.png'),
    ]

    static void main(String[] args) {
        SpringApplication.run Application, args
    }

    @RequestMapping(value="/games", method=GET)
    List<Game> listGames() {
        return gamesRepository
    }
}
