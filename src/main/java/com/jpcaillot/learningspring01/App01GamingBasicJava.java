package com.jpcaillot.learningspring01;

import com.jpcaillot.learningspring01.game.GameRunner;
import com.jpcaillot.learningspring01.game.MarioGame;
import com.jpcaillot.learningspring01.game.PacManGame;
import com.jpcaillot.learningspring01.game.SuperContraGame;

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
