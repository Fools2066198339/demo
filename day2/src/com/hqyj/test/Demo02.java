package com.hqyj.test;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-13-13:27
 */
public class Demo02 {
    public static void main(String[] args) {
        //赋值运算符
        int i = 3;
        i += 1;
        System.out.println(i);
        byte b = 1;
        b+=1;
        System.out.println(b);
        System.out.println("i-=2 = " + (i -= 2));
        System.out.println("(i*=2) = " + (i *= 2));
        System.out.println("(i/=2) = " + (i /= 2));
        System.out.println("(i%=2) = " + (i %= 2));

    }
}
