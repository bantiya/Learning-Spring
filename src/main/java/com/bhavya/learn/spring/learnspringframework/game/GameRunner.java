package com.bhavya.learn.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// Allows Spring to automatically discover and register your beans (objects) in the ApplicationContext, making them available for dependency injection and other Spring-managed processes.
public class GameRunner {

    @Autowired
    // Process of wiring in dependencies for a Sprin Bean
    // Dependency Injection / Inversion of Control (IoC)
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}
