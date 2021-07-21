package com.hqyj.clazz;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-16-13:32
 */
public class TestRandom {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int randomNum = random.nextInt(100);
        System.out.println(randomNum);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();
            if (num > randomNum) {
                System.out.println("你猜的数字太大了");
            } else if (num < randomNum) {
                System.out.println("你猜的数字太小了");
            } else {
                System.out.println("你猜对了");
                break;
            }

        }
    }
}
