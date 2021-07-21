package com.hqyj.lk;

import java.util.ArrayList;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-19-13:35
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        printList(list);
        System.out.println();
        for (String str : list) {
            System.out.print(str+" ");
        }
    }

    public static void printList(ArrayList<String> list) {
        list.add("刘奎");
        list.add("真帅！");
        for (String s : list) {
            System.out.print(s+" ");
        }

    }
}
