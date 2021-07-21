package com.hqyj.lk;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-20-9:02
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2);
        String s3 = new String(new char[]{'a', 'b', 'c'});
        System.out.println(s1.equals(s3));
        String s4 = "aBc";
        System.out.println("\" \".equals(s1) = " + " ".equals(s1));
        System.out.println("s1.equalsIgnoreCase(s4) = " + s1.equalsIgnoreCase(s4));
/*        String s1 = new String();
        System.out.println("s1 = " + s1);
        String s2 = new String(new char[]{'a', 'b', 'c'});
        System.out.println("s2 = " + s2);
        String s3 = new String(new byte[]{97, 98, 99});
        System.out.println("s3 = " + s3);
        String s4 = "abc";
        System.out.println("s4 = " + s4);*/

       /* StringBuilder str = new StringBuilder();
        str.append("adc");
        System.out.println("str = " + str);
        str.append("s");
        System.out.println("str = " + str);
        System.out.println("str.charAt(0) = " + str.charAt(0));*/



    }
}
