package com.hqyj.lk;

import java.util.Arrays;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-16-9:11
 */
public class DoubleArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array[0]));
        int[][] arr = new int[3][];
        System.out.println(arr[0]);
        arr[0]= new int[]{1};
        System.out.println(arr[0]);
    }
}
