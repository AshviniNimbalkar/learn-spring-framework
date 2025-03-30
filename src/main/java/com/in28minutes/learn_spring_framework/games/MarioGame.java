package com.in28minutes.learn_spring_framework.games;

public class MarioGame implements GamingConsole{
    @Override
    public String toString() {
        return "MarioGame{}";
    }
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go into hole");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("accelerate");
    }
}
