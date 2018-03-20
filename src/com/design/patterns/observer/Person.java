package com.design.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {


    /**
     * Observable  ���۲��߶���
     * arg   House.notifyObservers(price);   �۸����
     */
    @Override
    public void update(Observable o, Object arg) {  //һ����۲�����ݷ����ı�
        if (o instanceof House) {   //������ڷ���House����۲��߱��ı���
            if (arg instanceof Double) {
                System.out.println("[����������], �¼۸�" + arg);
            }
        }
    }




}
