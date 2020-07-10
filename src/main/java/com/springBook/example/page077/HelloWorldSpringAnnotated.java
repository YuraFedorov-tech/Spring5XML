package com.springBook.example.page077;
/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class HelloWorldSpringAnnotated {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer messageRenderer=ctx.getBean("renderer",MessageRenderer.class);
        messageRenderer.render();
    }
}
