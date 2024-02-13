package com.bhavya.learn.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

// In order to
@Component
public class PacMan implements GamingConsole{
    public void up() {
        System.out.println("PacMan Up");
    }

    public void down() {
        System.out.println("PacMan Down");
    }

    public void left() {
        System.out.println("PacMan left");
    }

    public void right() {
        System.out.println("PacMan right");
    }
}
