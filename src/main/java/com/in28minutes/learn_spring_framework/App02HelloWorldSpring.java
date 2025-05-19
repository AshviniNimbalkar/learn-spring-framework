package com.in28minutes.learn_spring_framework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;

public class App02HelloWorldSpring {
    public static void main(String[]args){
        // 1: launch spring app context
       var context = new  AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2 : Configure things that we want spring to manage -
        // 1-HelloWorldConfiguration -@Configuration
        //2- name @Bean
        //3-Retrive beans managed by spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean(Person.class));
    }
}
