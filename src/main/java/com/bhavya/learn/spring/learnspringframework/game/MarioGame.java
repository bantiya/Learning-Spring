package com.bhavya.learn.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
// Allows Spring to automatically discover and register your beans (objects) in the ApplicationContext, making them available for dependency injection and other Spring-managed processes.
public class MarioGame implements GamingConsole{
    public void up() {
        System.out.println("MarioGame Jump");
    }

    public void down() {
        System.out.println("MarioGame Down in the hole");
    }

    public void left() {
        System.out.println("MarioGame Stop");
    }

    public void right() {
        System.out.println("MarioGame Accelerate");
    }
}
