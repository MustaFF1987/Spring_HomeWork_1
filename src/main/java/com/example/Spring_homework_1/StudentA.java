package com.example.Spring_homework_1;

import java.util.Objects;

public class StudentA {

    private String name;

    private int age;

    public StudentA() {
    }

    public StudentA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentA student)) return false;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "StudentA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
