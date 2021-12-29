package com.bikash.LearnSpring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GamingConsole{

    @Override
    public void up() {
        System.out.println("move up");
    }

    @Override
    public void down() {
        System.out.println("move down");
    }

    @Override
    public void left() {
        System.out.println("move left");
    }

    @Override
    public void right() {
        System.out.println("move right");
    }
}
