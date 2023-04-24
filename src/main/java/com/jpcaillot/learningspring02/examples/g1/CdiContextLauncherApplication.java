package com.jpcaillot.learningspring02.examples.g1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Component
class BusinessService {
    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

    @Inject //jakarta alternative
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}

@Named //jakarta alternative
class DataService {

}

@Configuration
@ComponentScan //in the same package by default
public class CdiContextLauncherApplication {

    public static void main(String[] args) {
        
        try (var context = 
            new AnnotationConfigApplicationContext
                (CdiContextLauncherApplication.class))        
        {
            Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

                System.out.println
                    (context.getBean(BusinessService.class)
                        .getDataService());
        }

    }
    

}


