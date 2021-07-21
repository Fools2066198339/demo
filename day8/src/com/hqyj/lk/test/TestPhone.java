package com.hqyj.lk.test;

import com.hqyj.lk.extendsdemo.NewPhone;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-21-13:29
 */
public class TestPhone {

    /**
     * 有一个手机类，它能够打电话，发短信，显示来电信息
     * 现在有一个新手机，除了以上功能，还能打游戏，显示来电头像，拍照功能
     * 要求:使用新手机在一个方法中，输出以上所有功能
     */
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
//        phone.show();
        phone.a();
    }
}

