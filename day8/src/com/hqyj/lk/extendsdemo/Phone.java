package com.hqyj.lk.extendsdemo;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-21-13:22
 */
public class Phone {
    String name = "ff";

    public Phone() {
        a();
    }

    public Phone(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println("我正在打电话！");
    }

    public void sendMessage() {
        System.out.println("我正在发短信！");
    }

    public void showCallings() {
        System.out.println("显示来电信息！");
    }

    public void show() {
        call();
        sendMessage();
        showCallings();
    }

    public void a() {
        System.out.println("父类"+name);
    }
}

