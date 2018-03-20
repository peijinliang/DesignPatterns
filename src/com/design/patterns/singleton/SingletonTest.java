package com.design.patterns.singleton;

/**
 * �����ļ��ֵ������ģʽ
 * <p>
 * ϣ��һ����ֻ��һ��Ψһ��ʵ�������� ���õ������ģʽ��
 * <p>
 * ����ʽ���ģʽ
 * �������ģʽ
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
