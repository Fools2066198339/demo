package com.hqyj.lk;

import java.util.Scanner;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-20-10:23
 */
public class StringMethod {
    public static void main(String[] args) {
/*        String s = "nbsjafsagfsagfsugfa";
        System.out.println(s);
        //打印字符串长度
        System.out.println("符串长度 " + s.length());
        //链接字符串
        System.out.println(s=s.concat("11111"));
        //获取致指定索引的值
        System.out.println("s.charAt(2) = " + s.charAt(2));
        //获取指定元素的索引
        System.out.println("s.indexOf(\"s\") = " + s.indexOf("s"));
        //获取指定字符串开始索引12
        System.out.println(s.substring(12));
        //获取指定字符串开始索引15，结束索引18
        System.out.println(s.substring(15, s.length()-1));*/
        getCounts();

    }
    public static void getCounts(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        int wordCount = 0,numberCount = 0,smalletCount = 0,otherCount=0;
//        char[] charStr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            char temp = str.charAt(i);
            // int num = Integer.parseInt(str.substring(i, i + 1));
            if (65 <= temp && temp <= 91 ) {
                wordCount++;
            } else if (97 <= temp && temp <= 123) {
                smalletCount++;
            } else if (48 <= str.charAt(i) && str.charAt(i) <58) {
                numberCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("数字个数:"+numberCount + ",大写字母个数:" + wordCount+",小写字母个数:"+smalletCount+",其他字符:"+otherCount);
    }
}
