package com.hqyj.lk.letcode;

import java.util.Arrays;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-16-16:31
 */
public class TestProblems {
    public static void main(String[] args) {
        //两数之和
        Problems p = new Problems();
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(p.twoSum(arr, 9)));
        //整数反转
        System.out.println(p.reverse(0));
        //回文数
        System.out.println(p.isPalindrome(0));
    }
}
