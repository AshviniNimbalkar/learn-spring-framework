package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
record Person(String name,int age){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Hello";
    }
    @Bean
    public int age(){
        return 15;
    }
    @Bean
    public Person person(){
        var person = new Person("Rajveer",9);
        return person;
    }
    //use existing bean
    @Bean
    @Primary
    public Person person2(){
        return new Person(name(),age());
    }
    @Bean
    public Person person3(String name ,int age){
        return new Person(name,age);
    }
}
