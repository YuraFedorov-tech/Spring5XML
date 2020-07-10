package com.springBook.example.book1;
/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */

public class Main {
    public static void main(String[] args) {
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
