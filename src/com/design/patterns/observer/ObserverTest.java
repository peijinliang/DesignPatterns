package com.design.patterns.observer;

/**
 * 观察者设计模式
 * 一批人观察房价涨势，如果房价上涨了，大家就积极的去买房子去
 */
public class ObserverTest {

    public static void main(String[] args) {
        Person perA = new Person();
        Person perB = new Person();
        Person perC = new Person();
        House house = new House(80000.00);  //被观察者

        house.addObserver(perA);
        house.addObserver(perB);
        house.addObserver(perC);   //观察者

        house.setPrice(100000);

    }


}
