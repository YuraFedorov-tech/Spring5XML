package com.springBook.example.page092;

/*
 *
 *@Data 10.07.2020
 *@autor Fedorov Yuri
 *@project example
 *
 */

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class XmlConfigWithBeanFactory {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr=new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions("spring/xml-bean-factory-config.xml");
        Oracle oracle= (Oracle) factory.getBean("wiseworrn");
        System.out.println(oracle.defineMeaningOfLife());
    }
}
