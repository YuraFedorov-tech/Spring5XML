package com.springBook.example.page103;


import com.springBook.example.book2.HelloWorldMessageProvider;
import com.springBook.example.book2.MessageProvider;
import com.springBook.example.book2.MessageRenderer;
import com.springBook.example.book2.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MessageRenderer renderer() {
        MessageRenderer mr = new StandardOutMessageRenderer();
        mr.setMessageProvider(provider());
        return mr;

    }

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }
}

