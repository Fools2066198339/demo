package com.lk;

import java.util.Objects;

public class Test {
    private  String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test test = (Test) o;
        return Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Test str =new Test("liukui");
        System.out.println(str.equals("liukui"));
        
    }

}