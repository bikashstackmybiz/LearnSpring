package com.bikash.LearnSpring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {
    @Override
    public void up(){
        System.out.println("Jump");
    }
    @Override
    public void down(){
        System.out.println("move down");
    }
    @Override
    public void left(){
        System.out.println("go in the deep");
    }
    @Override
    public void right(){
        System.out.println("move right");
    }

}
