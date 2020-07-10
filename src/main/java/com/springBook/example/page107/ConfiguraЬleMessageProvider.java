package com.springBook.example.page107;
/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */

import com.springBook.example.book2.MessageProvider;

public class ConfiguraЬleMessageProvider implements MessageProvider {
    private String message;

    public ConfiguraЬleMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
