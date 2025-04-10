package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.games.GameRunner;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.games")
public class GamingAppLauncherSpringApplication {

    /*@Bean
    public GamingConsole game(){
        return new PacMan();
    }*/

    /*Bean
    public GameRunner gameRunner(){
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }*/
    /*@Bean
    public GameRunner gameRunner( GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }*/

    public static void main(String[]args){
        //var game = new MarioGame();
        //var game = new SuperContract();
        /*var game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();*/

        var context = new AnnotationConfigApplicationContext(GamingAppLauncherSpringApplication.class);
        //System.out.println(context.getBean("game"));
        context.getBean(GameRunner.class).run();
    }
}
