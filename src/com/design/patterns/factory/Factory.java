package com.design.patterns.factory;

/**
 * java  =  jvm  = ����ϵͳ
 * <p>
 * ������Ϊ�ؼ��� newʹ�õ� �����
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
