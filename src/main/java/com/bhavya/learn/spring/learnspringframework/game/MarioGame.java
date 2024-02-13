package com.bhavya.learn.spring.learnspringframework.game;

public class MarioGame implements GamingConsole{
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Down in the hole");
    }

    public void left() {
        System.out.println("Stop");
    }

    public void right() {
        System.out.println("Accelerate");
    }
}
