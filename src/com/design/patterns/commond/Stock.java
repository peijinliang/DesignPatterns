package com.design.patterns.commond;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe Stock 股票
 **/
public class Stock {

    private String name = "ABC";  //股票的名称
    private int quantity = 10;    //股票的数量

    public void buy() {
        System.out.println("Stock [ name " + name + "Quantity: " + quantity + "] bought");
    }

    public void sell() {
        System.out.println("Stock [ name " + name + "Quantity: " + quantity + "] sold");
    }


}
