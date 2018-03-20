package com.design.patterns.singleton;

/**
 * 常见的几种单例设计模式
 * <p>
 * 希望一个类只有一个唯一的实例化对象 采用单例设计模式。
 * <p>
 * 懒汉式设计模式
 * 饿汉设计模式
 */

public class SingletonTest {

    public static void main(String[] args) {

        XSingleton s1 = XSingleton.getInstanceE();
        XSingleton s2 = XSingleton.getInstanceE();
        XSingleton s3 = XSingleton.getInstanceE();

        s1.print();
        s2.print();
        s3.print();

        Sex a = Sex.getInstance(Sex.MALE_CMD);
        System.out.println(a);
    }


}
