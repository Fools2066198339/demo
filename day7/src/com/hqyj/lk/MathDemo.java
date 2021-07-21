package com.hqyj.lk;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-20-14:33
 */
public class MathDemo {
    public static void main(String[] args) {
        int min = (int) Math.ceil(-10.8);
        int max = (int) Math.floor(5.9);
        int count = 0;
        for (int i = min; i < max; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        System.out.println('A' + 32);
        System.out.println("================");


    }

    public List<Integer> generate(int size) {
        // write your code here
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            num.add(i + 1);
        }
        return num;
    }
}
