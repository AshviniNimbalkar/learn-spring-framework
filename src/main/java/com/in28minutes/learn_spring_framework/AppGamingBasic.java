package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.games.*;

public class AppGamingBasic {
    public static void main(String[]args){
        //var game = new MarioGame();
        //var game = new SuperContract();
        var game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
