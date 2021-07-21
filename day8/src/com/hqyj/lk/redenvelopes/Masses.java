package com.hqyj.lk.redenvelopes;

import java.security.SecureRandom;
import java.text.DecimalFormat;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-21-15:17
 */
public class Masses extends Person{

    public Masses() {
    }

    public Masses(String name) {
        super(name);
    }

    public void getMoney(double money) {
        DecimalFormat df=new DecimalFormat("0.00");
        double sum=0;
        SecureRandom random= new SecureRandom();
        sum = money + this.getMoney();
        System.out.println("我是"+this.getName() +",本金:"+this.getMoney() +",红包:"+money+",余额:"+df.format(sum));
    }

    @Override
    public String toString() {
        return "我是"+this.getName() + ",余额:"+this.getMoney();
    }
}

