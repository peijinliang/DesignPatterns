package com.design.patterns.builder;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/
public class VegBurger extends Burger {


    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }


}
