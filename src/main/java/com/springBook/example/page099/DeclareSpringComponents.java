package com.springBook.example.page099;
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
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-contextxrn099.xml");
        MessageRenderer messageRenderer= ctx.getBean("renderer",MessageRenderer.class);
        messageRenderer.render();
    }


}
