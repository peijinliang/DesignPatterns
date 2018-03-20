package com.design.patterns.proxy;

/**
 * 代理设计模式
 * <p>
 * 代理的本质是：所有的真是业务逻辑操作都是与之辅助的功能类辅助完成。
 * <p>
 * 一个接口
 * 两个子类  一个真实实现 一个代理实现  。代理实现要调用真实实现，来完成所有的辅助操作。
 */

public class ProxyTest {

    public static void main(String[] args) {
        ISubject iSubject = ProxyFactory.getInstance();
        iSubject.save();
    }

}
