package com.bhavya.learn.spring.learnspringframework.game;

public class GameRunner {

    private MarioGame game;
    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}
