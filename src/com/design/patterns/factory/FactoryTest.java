package com.design.patterns.factory;

/**
 * 工厂模式
 * 有接口  有实现子类  有工厂类
 * 调度方法
 */

public class FactoryTest {


    public static void main(String[] args) {
        //子类接口进行对象的实例化操作
//        IFruit orange = new Orange();
//        orange.eat();
//        if (args.length != 1) {  //没有传递一个参数
//            System.out.println("对不起，程序执行错误。正确的格式 java");
//            System.exit(1); //退出程序
//        }
        //当我换子类的时候主方法并没有改变  apple
//        IFruit iFruit = Factory.getInstance(args[0]);

        IFruit apple = Factory.getInstance("apple");
        IFruit orange = Factory.getInstance("orange");
        apple.eat();
        orange.eat();
    }


}
