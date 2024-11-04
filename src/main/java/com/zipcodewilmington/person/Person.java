package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;

    public Person() {
    }

    public Person(int age) {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
    }

    public void setName(String name) {
    }

    public void setAge(int age) {
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
