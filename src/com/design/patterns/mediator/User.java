package com.design.patterns.mediator;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/
public class User {

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                       "name='" + name + '\'' +
                       '}';
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }

}
