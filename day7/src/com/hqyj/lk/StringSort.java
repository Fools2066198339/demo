package com.hqyj.lk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-20-15:19
 */
public class StringSort {
    public static void main(String[] args) {
        //输入一个字符串
        System.out.println("输入一个字符串:" );
        String str = new Scanner(System.in).next();
        //转换为字符数组
        char[] strChar = str.toCharArray();
        //升序排序
        Arrays.sort(strChar);
        //倒序打印
        System.out.println("倒序打印:");
        for (int i = strChar.length - 1; i >=0; i--) {
            System.out.print(strChar[i] + " ");
        }
        ArrayList<Integer> num = new ArrayList<>();

    }
}
