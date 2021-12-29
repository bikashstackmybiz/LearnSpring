package com.bikash.LearnSpring.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("UP");
    }
    public void down(){
        System.out.println("down");
    }
    public void left(){
        System.out.println("left");
    }
    public void right(){
        System.out.println("right");
    }

}
