package com.design.patterns.proxy;

/**
 * 真实实现
 */
public class RealSubject implements ISubject {

    @Override
    public void save() {
        System.out.println("蜘蛛侠，英勇的制止了犯罪行为");

    }
}
