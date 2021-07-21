package com.hqyj.lk.test;

import com.hqyj.lk.redenvelopes.HaremMaster;
import com.hqyj.lk.redenvelopes.Masses;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-21-15:34
 */
public class TestRed {
    public static void main(String[] args) {
        HaremMaster master = new HaremMaster("群主",1000);
        System.out.println(master);
        System.out.println("请输入红包总额和红包个数:");
        Scanner sc = new Scanner(System.in);
        double redMoney = sc.nextInt();
        int count =sc.nextInt();
        ArrayList<Double> list=master.handRedEnvelopes(redMoney, count);
        master.setMoney(master.getMoney() - redMoney);
        System.out.println(master+",红包:"+redMoney+",红包个数:"+count);
        for (int i = 0; i < list.size(); i++) {
            new Masses("成员"+(i+1)).getMoney(list.get(i));
        }
    }
}
