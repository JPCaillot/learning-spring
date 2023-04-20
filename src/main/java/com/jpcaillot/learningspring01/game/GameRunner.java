package com.jpcaillot.learningspring01.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        //normally best practice to use logging framework
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
