package com.design.patterns.observer;

import java.util.Observable;

public class House extends Observable {  //���۲���

    private double price;  //���۲���

    public House(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > this.price) {    //�۸�����
            super.setChanged();      //���ڹ�ע�����ݸı���
            super.notifyObservers(price);   // �������еĹ۲���
        }
        this.price = price;
    }


}
