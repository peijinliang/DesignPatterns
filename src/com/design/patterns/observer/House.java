package com.design.patterns.observer;

import java.util.Observable;

public class House extends Observable {  //被观察者

    private double price;  //被观察者

    public House(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > this.price) {    //价格上涨
            super.setChanged();      //现在关注的内容改变了
            super.notifyObservers(price);   // 唤醒所有的观察者
        }
        this.price = price;
    }


}
