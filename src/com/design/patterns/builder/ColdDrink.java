package com.design.patterns.builder;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }


}
