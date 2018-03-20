package com.design.patterns.mediator;

import java.util.Date;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/

public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }

}
