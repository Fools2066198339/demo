package com.hqyj.clazz;

import java.util.Objects;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-16-10:31
 */
public class Phone {
    private String logo = "";
    private double price;
    private String color;

    public Phone() {
        this.logo = "iPhone";
        this.price = 8848;
        this.color = "黄色";
    }

    public Phone(String logo, int price, String color) {
        this.logo = logo;
        this.price = price;
        this.color = color;
    }

    public void call() {
        System.out.println("我使用的手机是" + this.logo + ",价格是" + this.price + ",颜色是" + this.color + ",我正在使用" + this.logo + "手机打电话！！");
    }

    public void call(String s) {
        System.out.println("我使用的手机是" + this.logo + ",价格是" + this.price + ",颜色是" + this.color + ",我正在使用" + this.logo + "手机给" + s + "打电话！！");
    }

    public void sendMessage() {
        System.out.println(this.logo + "其正在发短信！！！");
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Phone)) {
            return false;
        }
        Phone phone = (Phone) o;
        return price == phone.price &&
                Objects.equals(logo, phone.logo) &&
                Objects.equals(color, phone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logo, price, color);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "logo='" + logo + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
