package com.design.patterns.proxy;

/**
 * �������ģʽ
 * <p>
 * ����ı����ǣ����е�����ҵ���߼�����������֮�����Ĺ����ศ����ɡ�
 * <p>
 * һ���ӿ�
 * ��������  һ����ʵʵ�� һ������ʵ��  ������ʵ��Ҫ������ʵʵ�֣���������еĸ���������
 */

public class ProxyTest {

    public static void main(String[] args) {
        ISubject iSubject = ProxyFactory.getInstance();
        iSubject.save();
    }

}
