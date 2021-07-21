package com.hqyj.lk;

import java.util.Scanner;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-14-9:56
 */
public class Test2 {
    public static void main(String[] args) {
        //打印5*8矩阵
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

        //金字塔
            System.out.print("请输入金字塔层数：\n");
            int rows = new Scanner(System.in).nextInt();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= 2*i-1; k++) {
                    //(i % 2 == 1 ? "1" : "2")
                    //+" "
                    System.out.print("*"+" ");
                }
                System.out.println();
            }


    }
}
