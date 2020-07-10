package com.springBook.example.book2;
/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */

import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;
    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    private MessageSupportFactory() {
        Properties prop = new Properties();
        try {

            prop.load(this.getClass().getResourceAsStream("/msf.properties"));
            String renderClass=prop.getProperty("renderer.Class");
            String providerClass=prop.getProperty("provider.Class");
            renderer= (MessageRenderer) Class.forName(renderClass).newInstance();
            provider= (MessageProvider) Class.forName(providerClass).newInstance();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    static {
        instance=new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }

    public MessageProvider getProvider() {
        return provider;
    }
}
