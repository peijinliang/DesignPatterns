package com.design.patterns.proxy;

public class ProxyFactory {

    public static ISubject getInstance(){
        return  new ProxySubject(new RealSubject());
    }






}
