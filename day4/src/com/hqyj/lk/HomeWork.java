package com.hqyj.lk;

import java.util.Scanner;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-15-15:02
 */
public class HomeWork {
    public static void main(String[] args) {
       // int[] arr = {95,95,96,91,93,97};
        int[] arr = new int[6];
        System.out.println("请输入分数:");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int grade = input.nextInt();
            if (grade < 0 || grade > 100) {
                System.out.println("滚回去再来！！！");
                break;
            }
            arr[i] = grade;
        }
        System.out.println("平均分为: " + getAver(arr));
//        System.out.println(Arrays.toString(arr));
    }

    public static double getAver(int[] arr) {
        //冒泡排序
        double sum = 0;
        //控制外循环次数
        for (int x = 0; x < arr.length - 1; x++) {
            //-1是为了避免角标越界异常，-x是为了减少外循环次数
            for (int y = 0; y < arr.length - 1 - x; y++) {
                //判断两个相邻元素的大小
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
        //给最大值最小值赋0
        arr[0] = arr[arr.length - 1] = 0;
        //求和
        for (int i : arr) {
            sum += i;
        }
        return sum / (arr.length - 2);
    }
}
