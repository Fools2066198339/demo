package com.hqyj.lk.redenvelopes;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-21-15:13
 */
public class HaremMaster extends Person {
    public HaremMaster() {

    }

    public HaremMaster(String name,int money) {
        super(name,money);
    }


    public ArrayList<Double> handRedEnvelopes(double money, Integer count) {
        ArrayList<Double> list = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");
        Double sum = 0.0;
        do {
            double n = Double.parseDouble(df.format((Math.random() + 0.01) * 100));
            list.add(n);
            sum += n;
            if (sum > money || list.size() > count) {
                list.clear();
                sum = 0.0;
            }
        } while (list.size() != count || !sum.equals(money));

        System.out.println(list);
        return list;
    }

    @Override
    public String toString() {
        return "我是" +this.getName()+",我有"+this.getMoney()+"元";
    }
}
