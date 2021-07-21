package com.hqyj.test;

import java.util.Scanner;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-13-14:06
 */
public class TestScaner {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int grade = sc.nextInt();

            if (grade > 100 || grade < 0)
                System.out.println("滚回家去吧！");
            else if (90 <= grade)
                System.out.println("优秀");
            else if (grade >= 80)
                System.out.println("好");
            else if (grade >= 70)
                System.out.println("良");
            else if (grade >= 60)
                System.out.println("及格");
            else
                System.out.println("不及格");
            long endTime = System.currentTimeMillis();


        }
    }
}
