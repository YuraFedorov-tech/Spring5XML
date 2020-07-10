package com.springBook.example.book1;

/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider  messageProvider);
    MessageProvider getMessageProvider();
}
