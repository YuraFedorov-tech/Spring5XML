package com.springBook.example.page103;
/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */

import com.springBook.example.book2.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotated {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
       MessageRenderer rdr= (MessageRenderer) ctx.getBean("renderer", MessageRenderer.class);
        rdr.render();
    }
}
