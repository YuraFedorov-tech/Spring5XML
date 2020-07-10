package com.springBook.example.page077;
/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
