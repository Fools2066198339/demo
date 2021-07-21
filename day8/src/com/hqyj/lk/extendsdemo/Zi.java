package com.hqyj.lk.extendsdemo;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-21-10:01
 */
public class Zi extends Fu {
    private String name = super.name;

    @Override
    public void method() {
        super.method();
        System.out.println("我是你儿子");
    }
}
