package com.hqyj.clazz;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-16-10:38
 */
public class TeatPhone extends Phone{
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.call();
        p1.sendMessage();
//        System.out.println(p1);
//        System.out.println(p1.getColor());
        Phone p2=new Phone("xiaomi",1999,"黑色");
        p2.call("liukui");
        p2.sendMessage();
//        System.out.println(p2);
    }


}
