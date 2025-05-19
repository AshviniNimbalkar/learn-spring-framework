package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.games.GameRunner;
import com.in28minutes.learn_spring_framework.games.GamingConsole;
import com.in28minutes.learn_spring_framework.games.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GaminingConfiguration {
    @Bean
    public GamingConsole game(){
        return new PacMan();
    }

    /*Bean
    public GameRunner gameRunner(){
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }*/
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }



}
