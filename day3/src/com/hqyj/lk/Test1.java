package com.hqyj.lk;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-14-9:08
 */
public class Test1 {
    public static void main(String[] args) {
        //1-10奇数
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //1-100偶数和
        int sum = 0;
        for (int i = 0; i <= 100; i+=2) {
            sum+=i;
        }
        System.out.println("sum = " + sum);
        //1-100奇数和
        int a=1,s=0;
        while(a<100){
           s+=a;
           a+=2;
        }
        System.out.println("s = " + s);
    }
}
