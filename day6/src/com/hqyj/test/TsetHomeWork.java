package com.hqyj.test;

import com.hqyj.lk.HomeWork;
import com.hqyj.lk.Student;

import java.util.ArrayList;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-19-13:40
 */
public class TsetHomeWork {
    public static void main(String[] args) {
        //1.生成6个1-33的随机整数，添加到集合，并遍历
        System.out.println("1.生成6个1-33的随机整数，添加到集合，并遍历(元素不相等)");
        ArrayList<Integer> list = new ArrayList<Integer>();
        HomeWork.getNum(list);
        for (Integer num : list) {
            System.out.print(num+" ");
        }
        System.out.println();
        //2.自定义4个对象,添加到集合，并遍历
        System.out.println("2.自定义4个对象,添加到集合，并遍历");
        // 新建动态数组
        ArrayList<Student> studentArrayList = new ArrayList<>();
        // 添加student对象
        studentArrayList.add(new Student("刘奎","18104011107","男",23));
        studentArrayList.add(new Student("李四","18104011237","女",20));
        studentArrayList.add(new Student("王五","18104011607","男",100));
        studentArrayList.add(new Student("老王","18104051607","男",60));
        //遍历元素
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
        //3.打印{元素@元素@元素@元素}的集合
        System.out.println("3.打印{元素@元素@元素@元素}的集合");
        HomeWork.printArray(list);
        //4.把集合中的偶素添加到新集合中
        System.out.println("4.把集合中的偶素添加到新集合中");
        for (Integer oddNumber : HomeWork.getOdds(list)) {
            System.out.print(oddNumber+" ");
        }
    }
}
