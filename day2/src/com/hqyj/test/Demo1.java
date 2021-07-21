package com.hqyj.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 第一个demo
 *
 * @AUTHOR LK
 * @CREATE 2021-07-13-8:46
 */

//java的一个类
public class Demo1 {
    //java程序入口
    /*
     * main方法创建:psvm,main*/
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        int a = 22;
//        int age = 23;//见文知意
//
//        System.out.println("0.1 567 -9");
//        System.out.println("0.0 -0.1 2.55");
//        System.out.print('a');
//        System.out.println();
//        System.out.println('好');
//        System.out.println("A Hello 你好");
//        boolean flag = false;
//        System.out.println(flag);
//        flag = true;
//        System.out.println(flag);
//        System.out.println(getNull());
//
//        int A=1,B = 2;
//        System.out.println("A==B = " + (A == B));

        int h1=180,h2=185,h3=190,max=0;
/*        int h = (h1>h2 ? h1 : h2)>h3 ? (h1>h2 ? h1 : h2) :h3;
        int h4 = Math.max((Math.max(h1, h2)), h3);
        System.out.println(h);*/

        List<Integer> num = new ArrayList<>();
        num.add(h1);
        num.add(h2);
        num.add(h3);
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i)>max)
                max=num.get(i);
        }
        System.out.println("max = " + max);

    }



    public static String getNull() {
        return null;
    }
}
