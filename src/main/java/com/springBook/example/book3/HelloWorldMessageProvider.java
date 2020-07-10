package com.springBook.example.book3;
/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */

public class HelloWorldMessageProvider implements MessageProvider {
   @Override
    public String getMessage(){
        return"Hello World 3 ";
    }
}
