package com.jpcaillot.learningspring02.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
class ClassA {

}

@Component
@Lazy
class ClassB {

    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some initialization logic");
        this.classA = classA;        
    }

}

@Configuration
@ComponentScan //in the same package by default
public class LazyInitializationLauncherApplication {

    public static void main(String[] args) {
        
        try (var context = 
            new AnnotationConfigApplicationContext
                (LazyInitializationLauncherApplication.class))        
        {
            Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        }

    }
    

}


