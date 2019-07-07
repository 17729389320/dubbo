package com.alibaba.dubbo.demo.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.err.println(context.getDisplayName() + ": here");
        context.start();
        System.err.println("Provider start...");
        System.in.read();
    }
}
