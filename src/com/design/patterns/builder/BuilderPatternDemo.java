package com.design.patterns.builder;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/
public class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost :" + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("NoVeg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost :" + nonVegMeal.getCost());

    }



}
