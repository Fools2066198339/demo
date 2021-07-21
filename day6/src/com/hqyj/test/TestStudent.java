package com.hqyj.test;

import com.hqyj.lk.Student;

import java.util.ArrayList;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-19-9:43
 */
public class TestStudent {
    public static void main(String[] args) {
//        Student student = new Student("刘奎","18104011107","男",23);
//        student.setAge(20);
        // 新建动态数组
        ArrayList<Student> studentArrayList = new ArrayList<>();
        // 添加student对象
        studentArrayList.add(new Student("刘奎","18104011107","男",23));
        studentArrayList.add(new Student("李四","18104011237","女",20));
        studentArrayList.add(new Student("王五","18104011607","男",100));
        System.out.println(studentArrayList);
        // 删除指定下标元素
        System.out.println("删除元素 = " + studentArrayList.remove(0));
        System.out.println("======================== ");
        System.out.println(studentArrayList);
        // 获取指定下标元素
        System.out.println("studentArrayList.get(0) = " + studentArrayList.get(0));
        System.out.println("======================== ");
        System.out.println(studentArrayList);
        // 返回动态数组大小
        System.out.println("动态数组大小 " + studentArrayList.size());
        // 动态数组遍历
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.print(studentArrayList.get(i)+" ");

        }
        System.out.println();
        for (Student student : studentArrayList) {
            System.out.print(student+" ");
        }
    }
}
