package com.design.patterns.builder;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }

}
