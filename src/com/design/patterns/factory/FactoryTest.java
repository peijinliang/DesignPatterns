package com.design.patterns.factory;

/**
 * ����ģʽ
 * �нӿ�  ��ʵ������  �й�����
 * ���ȷ���
 */

public class FactoryTest {


    public static void main(String[] args) {
        //����ӿڽ��ж����ʵ��������
//        IFruit orange = new Orange();
//        orange.eat();
//        if (args.length != 1) {  //û�д���һ������
//            System.out.println("�Բ��𣬳���ִ�д�����ȷ�ĸ�ʽ java");
//            System.exit(1); //�˳�����
//        }
        //���һ������ʱ����������û�иı�  apple
//        IFruit iFruit = Factory.getInstance(args[0]);

        IFruit apple = Factory.getInstance("apple");
        IFruit orange = Factory.getInstance("orange");
        apple.eat();
        orange.eat();
    }


}
