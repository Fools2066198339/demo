package com.hqyj.lk;

/**
 * @AUTHOR LK
 * @CREATE 2021-07-19-9:42
 */
public class Student {
    private String name;
    private String stuNumber;
    private String sex;
    private  int age;

    public Student() {
    }

    public Student(String name, String stuNumber, String sex, int age) {
        this.name = name;
        this.stuNumber = stuNumber;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名:"+name + ",学号:"+stuNumber + ",性别:"+sex + ",年龄:"+age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", stuNumber='" + stuNumber + '\'' +
//                ", sex='" + sex + '\'' +
//                ", age=" + age +
//                '}';
    }
}
