package com.hqyj.test;

import com.hqyj.lk.Contructor;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-19-9:04
 */
public class TestContructor {
    public static void main(String[] args) {
        Contructor cd =new Contructor();
        System.out.println(cd.name);
        System.out.println(cd.age);
        cd.name = "刘奎";
        cd.age = 23;
        System.out.println(cd.name);
        System.out.println(cd.age);
        Contructor cd2=new Contructor("张三",22);
        System.out.println(cd2.name);
        System.out.println(cd2.age);
    }
}
