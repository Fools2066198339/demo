package com.hqyj.test;

import java.util.Scanner;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-13-14:37
 */
public class TestSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 0:
            case 12:
                System.out.println("输入错误！");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                break;
            default:
                System.out.println("冬季");


        }
    }
}
