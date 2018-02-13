package com.design.patterns.proxy;

public class ProxySubject implements ISubject {

    private ISubject subject;

    public ProxySubject(ISubject subject) {
        this.subject = subject;
    }

    public void broke() {
        System.out.println("蜘蛛侠，破门而入！");
    }

    @Override
    public void save() {   //救人操作
        broke();
        this.subject.save();
        getPraise();
    }

    public void getPraise() {  //获得赞誉
        System.out.println("蜘蛛侠，入选2018年牛逼人物！");
    }

}
