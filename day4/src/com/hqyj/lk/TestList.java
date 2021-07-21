package com.hqyj.lk;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-14-20:28
 */
public class TestList {
    public static void main(String[] args) {
        //顺序表
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        //删除元素
        list.remove(1);
        //修改指定index元素
        list.set(1,1);
        //遍历输出数组元素
        for (Integer i : list) {
            System.out.println(i);
        }
        //通过index获取元素
        System.out.println(list.get(1));
        System.out.println(list);

        //链表
        LinkedList<Integer> list2= new LinkedList<>();
        //添加元素
        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }
        //获取第一个元素
        System.out.println(list2.getFirst());
        //获取最后一个元素
        System.out.println(list2.getLast());
        //添加一个首元素
        list2.addFirst(11);
        //添加一个尾元素
        list2.addLast(10);
        //遍历输出
        for (Integer i : list2) {
            System.out.println(i);
        }
        //删除第一个元素
        System.out.println(list2.removeFirst());
        //删除最后一个元素
        System.out.println(list2.removeLast());
        System.out.println(list2.pop());
        list2.push(101);
        System.out.println(list2);
        System.out.println(list2.isEmpty() ? 0 : list2.size());

        Object[] arr = list.toArray();
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }


}
