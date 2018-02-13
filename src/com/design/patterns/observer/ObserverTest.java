package com.design.patterns.observer;

/**
 * �۲������ģʽ
 * һ���˹۲췿�����ƣ�������������ˣ���Ҿͻ�����ȥ����ȥ
 */
public class ObserverTest {

    public static void main(String[] args) {
        Person perA = new Person();
        Person perB = new Person();
        Person perC = new Person();
        House house = new House(80000.00);  //���۲���

        house.addObserver(perA);
        house.addObserver(perB);
        house.addObserver(perC);   //�۲���

        house.setPrice(100000);

    }


}
