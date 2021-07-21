package com.hqyj.test;

import java.util.Scanner;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-13-14:58
 */
public class HomeWork {
    public static void main(String[] args) {
        //1.输出1~100内前5个可以被3整除的数
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 && count < 5) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("=================");
        //2.用for循环和while打印九九乘法表
        for (int i = 1; i < 10; i++) {
            int j = 1;
            while (i >= j) {
                System.out.printf("%d*%d=%d\t", j, i, i * j);
                j += 1;
            }
            System.out.println();
        }
        System.out.println("=================");
        /**
         * 3.打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
         * 其各位数字立方和等于该数本身。*例如：153是一个 "水仙花数 "，
         * 因为153=1的三次方＋5的三次方＋3的三次方。
         */
        System.out.println("水仙花数(100-1000):");
        for (int num = 100; num < 1000; num++) {
            int gewei = num % 10;
            int shiwei = (num % 100) / 10;
            int baiwei = num / 100;
            if ((Math.pow(gewei, 3) + Math.pow(shiwei, 3) + Math.pow(baiwei, 3)) == num) {
                System.out.println("num = " + num);
            }
        }
        System.out.println("=================");
        // 4.输出101~200内的质数
        int c = 0;
        for (int i = 101; i <= 200; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (c == 5) {
                    System.out.println();
                    c = 0;
                }
                System.out.print(i + " ");
                c++;
            }
        }
        System.out.println("\n=================");
        //5.计算2000年1月1日到2008年1月1日相距多少天
        int sum = 0, day;
        for (int i = 2000; i <= 2008; i++) {
            if ((i % 4 == 0 && i % 100 == 0) || i % 400 == 0) {
                day = 366;
            } else {
                day = 365;
            }

            sum += day;
        }
        System.out.println("2000年1月1日到2008年1月1日相距:" + sum);
        System.out.println("=================");
        //6.用for循环计算1！+2！+3！+...+10
        int counts = 0;
        int s = 1;
        for (int i = 1; i <= 10; i++) {
            s *= i;
            counts += s;
        }
        System.out.println("counts = " + counts);
        System.out.println("=================");

        //7.用for循环求2+22+222+2222+22222+…的和
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想加到几位2*:");
        int grade = sc.nextInt();
        int result = 2;
        for (int i = 1; i <= grade; i++) {
            int value = 0;
            for (int j = 0; j <= i; j++) {
                value += 2 * Math.pow(10, j);
            }
            result += value;
        }
        System.out.println("result = " + result);
        System.out.println("=================");
        //8.100元怎么买100个蛋，鸡蛋1毛一个，鸭蛋3元一个，鹅蛋6元一个
        int n = 0;
        for (int i = 0; i < 34; i++) {
            for (int j = 0; j < 17; j++) {
                int money = i * 30 + j * 60 + (100 - i - j);
                if (money == 1000) {
                    n++;
                    System.out.print("鸭蛋:" + i + "个 " + "鹅蛋:" + j + "个 " + "鸡蛋:" + (100 - i - j) + "个 ");
                }
            }
        }
        System.out.println(" 结果 = " + n);
    }
}
