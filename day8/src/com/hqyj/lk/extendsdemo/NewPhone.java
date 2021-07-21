package com.hqyj.lk.extendsdemo;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-21-13:25
 */
public class NewPhone extends Phone {
    static String name = "zz";

    public NewPhone() {
    }

    public NewPhone(String name) {
        NewPhone.name = name;
    }

    public void playGames() {
        System.out.println("我正在打游戏");
    }

    public void showHeadPicture() {
        System.out.println("显示头像！");
    }

    public void takePicture() {
        System.out.println("正在拍照！");
    }

    @Override
    public void show() {
        super.show();
        playGames();
        showHeadPicture();
        takePicture();
    }

    @Override
    public void a() {
        System.out.println("子类"+name);
    }
}
