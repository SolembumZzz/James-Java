package com.codegym;

public class Test {
    public static void main(String[] args) {
        Student Jimmy = new Student();
        Student Rose = new Student();

        System.out.println("Before setting student1: " + Jimmy.getName() + Jimmy.getClasses());
        System.out.println("Before setting student2: " + Rose.getName() + Rose.getClasses());

        Jimmy.setName("Jimmy");
        Rose.setName("Rose");
        Jimmy.setClasses("C03");
        Rose.setClasses("H01");

        System.out.println("After setting student1: " + Jimmy.getName() + Jimmy.getClasses());
        System.out.println("Before setting student2: " + Rose.getName() + Rose.getClasses());
    }
}
