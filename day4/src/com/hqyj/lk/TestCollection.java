package com.hqyj.lk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-14-20:50
 */
public class TestCollection {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
//往集合中添加元素
        coll.add("科比");
        coll.add("麦迪");
        coll.add("卡特");
        coll.add("艾弗森");
//多态方式创建Iterator对象
        Iterator<String> it = coll.iterator();
//取出一个数据
       //String s = it.next();
//循环取出所有数据
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
        System.out.println("----------------------");
        for (Iterator<String> it2 = coll.iterator(); it2.hasNext(); ) {
            String e = it2.next();
            System.out.println(e);
        }


        ArrayList<Integer> list = new ArrayList<Integer>();
        //原来写法
        //list.add(12);
        //list.add(14);
        //list.add(15);
        //list.add(1000);
        //采用工具类 完成 往集合中添加元素
        Collections.addAll(list, 5, 222, 1,2);
        System.out.println(list);
        //排序方法
        Collections.sort(list);
        System.out.println(list);
    }
}
