package com.jpcaillot.learningspring01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jpcaillot.learningspring01.game.GameRunner;
import com.jpcaillot.learningspring01.game.GamingConsole;
import com.jpcaillot.learningspring01.game.PacManGame;

@Configuration
public class GamingConfiguration {
    
    @Bean
    public GamingConsole game() {
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
