package com.design.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }


    public void showItems() {
        for (Item item : items) {
            System.out.println("Item : " + item.name());
            System.out.print(",Packing  : " + item.packing().pack());
            System.out.print(",Price : " + item.price());
        }
    }

}
