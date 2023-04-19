package com.jpcaillot.learningspringvscode;

import com.jpcaillot.learningspringvscode.game.GameRunner;
import com.jpcaillot.learningspringvscode.game.MarioGame;
import com.jpcaillot.learningspringvscode.game.PacManGame;
import com.jpcaillot.learningspringvscode.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        
        var game = new PacManGame(); //1: Object Creation
        //var game = new MarioGame();
        //var game = new SuperContraGame();

        GameRunner gameRunner = new GameRunner(game);
            //2: Object Creation + Wiring of Dependencies
            //Game is a Dependency of GameRunner

        gameRunner.run();

    }

}
