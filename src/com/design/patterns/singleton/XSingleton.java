package com.design.patterns.singleton;

/**
 * 饿汉式
 * 1.构造方法私有化，外部无法产生新的实例化对象。只能通过static 方法获取实例化对象
 * 只要加载 就自动创建实例化对象。
 * 懒汉式
 * 1.第一次使用进行实例化
 * 2.
 */
public class XSingleton {

    /**
     * 恶汉式
     */
    private final static XSingleton INSTANCE = new XSingleton();

    private XSingleton() {

    }

    public static XSingleton getInstanceE() {
        return INSTANCE;
    }

    /**
     * 懒汉式
     *
     * @return
     */
    private static XSingleton xSingleton;

    //synchronized  加锁
    public static synchronized XSingleton getInstanceL() {  //多线程问题严重
        if (xSingleton == null) {
            xSingleton = new XSingleton();
        }
        return xSingleton;
    }

    public void print() {
        System.out.println("单例设计模式学习-++-");
    }

}
