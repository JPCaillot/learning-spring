package com.jpcaillot.learningspring02.examples.a1;

import java.util.Arrays;

import org.springframework.aot.generate.GeneratedMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//YourBusinessClass
@Component
class YourBusinessClass {

    //@Autowired - Field injection
    Dependency1 dependency1;

    //@Autowired - Field injection
    Dependency2 dependency2;

    //@Autowired //- Constructor injection - annotation not required
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    //@Autowired - Setter injection
    //public void setDependency1(Dependency1 dependency1) {
    //    this.dependency1 = dependency1;
    //}
//
    //@Autowired
    //public void setDependency2(Dependency2 dependency2) {
    //    this.dependency2 = dependency2;
    //}

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}
//Dependency1
@Component
class Dependency1 {

}
//Dependency2
@Component
class Dependency2 {

}

@Configuration
@ComponentScan //in the same package by default
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {
        
        try (var context = 
            new AnnotationConfigApplicationContext
                (DepInjectionLauncherApplication.class))        
        {
            Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class)); 
        }

    }
    

}


