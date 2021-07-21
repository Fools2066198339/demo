package com.hqyj.lk.redenvelopes;

import java.text.DecimalFormat;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-21-15:14
 */
public class Person {
    DecimalFormat df=new DecimalFormat("0.00");
    private String name;
    private double money=Double.parseDouble(df.format(Math.random()*100));

    public Person() {
    }

    public Person(String name) {
        this.name = name;

    }
    public Person(String name,int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
