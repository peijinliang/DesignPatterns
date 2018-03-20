package com.design.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {


    /**
     * Observable  被观察者对象
     * arg   House.notifyObservers(price);   价格参数
     */
    @Override
    public void update(Observable o, Object arg) {  //一旦你观察的内容发生改变
        if (o instanceof House) {   //如果现在发现House这个观察者被改变了
            if (arg instanceof Double) {
                System.out.println("[房价上涨了], 新价格：" + arg);
            }
        }
    }




}
