package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String address;
    private String email;
    private String phoneNumber;

    public Person() {
        this.name = "";
        this.age = 2147483647;

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        Person person = new Person("Leon", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
