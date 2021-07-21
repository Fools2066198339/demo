package com.hqyj.lk;

import java.security.SecureRandom;
import java.util.ArrayList;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-19-13:40
 */
public class HomeWork {
    // 1.生成6个1-33的随机整数，添加到集合，并遍历
    public static void  getNum(ArrayList<Integer> list) {
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 6; i++) {
            Integer num =random.nextInt(33)+1;
            if (list.contains(num)) {
                i--;
                continue;
            }
            list.add(num);
        }
    }
    //3.打印{元素@元素@元素@元素}的集合
    public static void printArray(ArrayList<Integer> list) {
        System.out.print("{");
        for (Integer num : list) {
            System.out.print(num+"@");
        }
        System.out.println("\b}");
    }
    //4.把集合中的偶素添加到新集合中
    public static ArrayList<Integer> getOdds(ArrayList<Integer> list) {
        ArrayList<Integer> oddNumbers=new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 == 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }
}
