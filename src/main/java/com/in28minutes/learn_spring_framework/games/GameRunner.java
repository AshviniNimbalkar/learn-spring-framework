package com.in28minutes.learn_spring_framework.games;

public class GameRunner {
    //MarioGame game;
    GamingConsole game;
    /*public GameRunner(MarioGame marioGame) {
        this.game= marioGame;
    }
*/
    public GameRunner(GamingConsole supercontract) {
        this.game= supercontract;


}

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
    }



