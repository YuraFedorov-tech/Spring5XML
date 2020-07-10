package com.springBook.example.page107;
/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */


import com.springBook.example.book2.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context107.xml");
        MessageRenderer renderer=ctx.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
}
