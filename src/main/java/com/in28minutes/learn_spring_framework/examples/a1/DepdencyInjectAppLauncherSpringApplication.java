package com.in28minutes.learn_spring_framework.examples.a1;

import com.in28minutes.learn_spring_framework.games.GameRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//BusinessClass
//Dependency1
//Dependency2
@Component
class BusinessClass{
    Dependency1 dependence1;
    Dependency2 dependency2;

    public Dependency1 getDependence1() {
        return dependence1;
    }

    public Dependency2 getDependency2() {
        return dependency2;
    }

    @Autowired
    public BusinessClass(Dependency1 dependence1, Dependency2 dependency2) {
        System.out.println("Constructor based dep!");
        this.dependence1 = dependence1;
        this.dependency2 = dependency2;
    }

    /*@Autowired
    public void setDependence1(Dependency1 dependence1) {
        this.dependence1 = dependence1;
    }
    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }*/

    /*@Autowired
            Dependency1 dependence1;
            @Autowired
            Dependency2 dependency2;*/




    public String toString(){
        return "Using "+ dependence1 +"  and  "+dependency2;
    }

}
@Component
class Dependency1{

}
@Component
class Dependency2{

}




@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework")
public class DepdencyInjectAppLauncherSpringApplication {

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

        var context = new AnnotationConfigApplicationContext(DepdencyInjectAppLauncherSpringApplication.class);
        //System.out.println(context.getBean("game"));
        //context.getBean(GameRunner.class).run();

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(BusinessClass.class));
    }
}
