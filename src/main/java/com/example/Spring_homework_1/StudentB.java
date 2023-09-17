package com.example.Spring_homework_1;

import java.util.Objects;


    public class StudentB {

        private String name;

        private int age;

        public StudentB() {
        }

        public StudentB(String name, int age) {
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
            if (!(o instanceof StudentB studentB)) return false;
            return age == studentB.age && Objects.equals(name, studentB.name);
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


