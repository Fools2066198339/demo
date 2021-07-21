package com.hqyj.lk.letcode;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-16-16:14
 */
public class Problems {
    //两数之和
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }

    //整数反转
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
                return 0;
            }
            int dligt = x % 10;
            x /= 10;
            res = res * 10 + dligt;
        }
        return res;
    }

    //回文数
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int intRes = 0;
        while (x > intRes) {
            intRes = intRes * 10 + x % 10;
            x/=10;
        }
        return x==intRes||x==intRes/10;
    }
}
