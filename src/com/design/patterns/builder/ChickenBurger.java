package com.design.patterns.builder;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/
public class ChickenBurger extends Burger {


    @Override
    public String name() {
        //»ð¼¦ºº±¤
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }

}
