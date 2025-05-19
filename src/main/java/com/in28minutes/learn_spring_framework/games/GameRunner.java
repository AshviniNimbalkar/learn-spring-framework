package com.in28minutes.learn_spring_framework.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    //MarioGame game;
    GamingConsole game;
    /*public GameRunner(MarioGame marioGame) {
        this.game= marioGame;
    }
*/
    public GameRunner(@Qualifier("SuperContractGameQualifier")GamingConsole supercontract) {
        this.game= supercontract;


}

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
    }



