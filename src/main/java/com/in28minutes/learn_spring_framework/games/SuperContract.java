package com.in28minutes.learn_spring_framework.games;

public class SuperContract implements GamingConsole{


    @Override
    public String toString() {
        return "SuperContract{}";
    }

    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Sit down");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Shoot a boolet");
    }
}
