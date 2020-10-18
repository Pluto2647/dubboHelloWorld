package com.pluto.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

// MainApplication：加载 Spring 配置

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        System.in.read();
    }
}
