package com.design.patterns.factory;

/**
 * java  =  jvm  = 操作系统
 * <p>
 * 降低因为关键字 new使用的 耦合性
 *
 */
public class Factory {


    public static IFruit getInstance(String className) {
        if ("apple".equals(className)) {
            return new Apple();
        } else if ("orange".equals(className)) {
            return new Orange();
        } else {
            return null;
        }
    }


}
