package com.design.patterns.singleton;

/**
 * ����ʽ
 * 1.���췽��˽�л����ⲿ�޷������µ�ʵ��������ֻ��ͨ��static ������ȡʵ��������
 * ֻҪ���� ���Զ�����ʵ��������
 * ����ʽ
 * 1.��һ��ʹ�ý���ʵ����
 * 2.
 */
public class XSingleton {

    /**
     * ��ʽ
     */
    private final static XSingleton INSTANCE = new XSingleton();

    private XSingleton() {

    }

    public static XSingleton getInstanceE() {
        return INSTANCE;
    }

    /**
     * ����ʽ
     *
     * @return
     */
    private static XSingleton xSingleton;

    //synchronized  ����
    public static synchronized XSingleton getInstanceL() {  //���߳���������
        if (xSingleton == null) {
            xSingleton = new XSingleton();
        }
        return xSingleton;
    }

    public void print() {
        System.out.println("�������ģʽѧϰ-++-");
    }

}
