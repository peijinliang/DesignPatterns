package com.design.patterns.proxy;

/**
 * ��ʵʵ��
 */
public class RealSubject implements ISubject {

    @Override
    public void save() {
        System.out.println("֩������Ӣ�µ���ֹ�˷�����Ϊ");

    }
}
