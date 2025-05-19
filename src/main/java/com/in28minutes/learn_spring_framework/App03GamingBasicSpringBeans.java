package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.games.GameRunner;
import com.in28minutes.learn_spring_framework.games.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicSpringBeans {
    public static void main(String[]args){
        //var game = new MarioGame();
        //var game = new SuperContract();
        /*var game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();*/

        var context = new AnnotationConfigApplicationContext(GaminingConfiguration.class);
        System.out.println(context.getBean("game"));
        context.getBean(GameRunner.class).run();
    }
}
