package com.example.Spring_homework_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        StudentA studentA1 = context.getBean(StudentA.class);
        StudentA studentA2 = context.getBean(StudentA.class);

        studentA1.setName("Maxim");
        studentA1.setAge(18);
        studentA2.setName("Alex");
        studentA2.setAge(20);
        System.out.println(studentA1.getName() + " " + studentA1.getAge());
        System.out.println(studentA1.getName() + " " + studentA2.getAge());


        StudentB studentB1 = context.getBean(StudentB.class);
        StudentB studentB2 = context.getBean(StudentB.class);

        studentB1.setName("Anna");
        System.out.println(studentB2.getName());

    }
}
