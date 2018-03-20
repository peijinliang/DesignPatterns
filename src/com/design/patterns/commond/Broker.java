package com.design.patterns.commond;

import java.util.ArrayList;
import java.util.List;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    //
    public void takeOrder(Order order) {
        orderList.add(order);
    }

    //placeOrders ¶©¹º
    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
