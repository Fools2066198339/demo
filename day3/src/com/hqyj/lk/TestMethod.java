package com.hqyj.lk;

import java.util.Scanner;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-14-11:19
 */
public class TestMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // 输出斐波拉契数列前10个
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += getFib(i);
            System.out.print(getFib(i) + " ");
        }
        System.out.println("\nsum = " + sum);

        //1.输出1~100内前5个可以被3整除的数
        System.out.println("1~100内前5个可以被3整除的数有:"  );
        get5Sum();
        //2.用for循环和while打印九九乘法表
        get99();

        // 4.输出101~200内的质数
        System.out.println("请输入打印素数的起止: ");
        int s = input.nextInt();
        int e = input.nextInt();
        System.out.println(s + "到" + e + "素数的和为: ");
        getPrime(s, e);
        System.out.println();

        //5.计算2000年1月1日到2008年1月1日相距多少天
        System.out.println("请输入开始和结束的时间:");
        int start = input.nextInt();
        int end = input.nextInt();
        System.out.println(start + "年到" + end + "年的总天数为: " + getYearDays(start, end));

        // 6.用for循环计算1！+2！+3！+...+10
        System.out.println("请输入你想加第几个数的阶乘:");
        int num1 = input.nextInt();
        System.out.println("前" + num1 + "项的阶乘为: " + getCount(num1));

        //7.用for循环求2+22+222+2222+22222+…的和
        System.out.println("请输入你想加到几位2*:");
        int num2 = input.nextInt();
        System.out.println("前" + num2 + "项的和为: " + getSum2(num2));

    }

    //斐波拉契数列
    public static int getFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return getFib(n - 1) + getFib(n - 2);
        }
    }

    //1~100内前5个可以被3整除的数
    public static void get5Sum() {
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                if (count==5) {
                    break;
                }
                System.out.println(i);
                count++;
            }
        }
    }

    //九九乘法表
    public static void get99() {
        for (int i = 1; i < 10; i++) {
            int j = 1;
            while (i >= j) {
//                System.out.printf("%d*%d=%d\t", j, i, i * j);
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
                j += 1;
            }
            System.out.println();
        }
    }

    //输出素数
    public static void getPrime(int start, int end) {
        int c = 0;
        for (int i = start; i <= end; i++) {
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
    }

    //阶乘求和
    public static int getCount(int n) {
        if (n == 1) {
            System.out.print(n+"!="+"1");
            return 1;

        }
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        System.out.print(n+"!="+s+" ");
        return s + getCount(n - 1);
    }

    //2!求和
    public static int getSum2(int n) {
        if (n == 0) {
            return 0;
        }
        int value = 0;
        for (int j = 0; j < n; j++) {
            value += 2 * Math.pow(10, j);
        }
        return value + getSum2(n - 1);
    }

    //求两年间天数
    public static int getYearDays(int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                sum += 366;
            } else {
                sum += 365;
            }
        }
        return sum;
    }

}
