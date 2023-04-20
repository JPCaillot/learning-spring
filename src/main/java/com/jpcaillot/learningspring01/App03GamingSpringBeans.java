package com.jpcaillot.learningspring01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpcaillot.learningspring01.game.GameRunner;
import com.jpcaillot.learningspring01.game.GamingConsole;

public class App03GamingSpringBeans {

    public static void main(String[] args) {
        
        try (var context = 
            new AnnotationConfigApplicationContext
                (GamingConfiguration.class))        
        {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }

    }
    

}
