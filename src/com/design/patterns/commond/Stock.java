package com.design.patterns.commond;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe Stock ��Ʊ
 **/
public class Stock {

    private String name = "ABC";  //��Ʊ������
    private int quantity = 10;    //��Ʊ������

    public void buy() {
        System.out.println("Stock [ name " + name + "Quantity: " + quantity + "] bought");
    }

    public void sell() {
        System.out.println("Stock [ name " + name + "Quantity: " + quantity + "] sold");
    }


}
