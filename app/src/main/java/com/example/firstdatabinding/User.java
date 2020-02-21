package com.example.firstdatabinding;

public class User {

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
