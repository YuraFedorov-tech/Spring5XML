package com.springBook.example.page099;
/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */

import com.springBook.example.book2.MessageProvider;
import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "page 099";
    }
}
