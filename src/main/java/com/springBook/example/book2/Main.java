package com.springBook.example.book2;
/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */

public class Main {
    public static void main(String[] args) {

        MessageProvider messageProvider = MessageSupportFactory.getInstance().getProvider();
        MessageRenderer messageRenderer = MessageSupportFactory.getInstance().getRenderer();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }

    /*
    renderer.Class= com.springBook.example.book2.StandardOutMessageRenderer
    provider.Class= com.springBook.example.book2.HelloWorldMessageProvider
     */
}
