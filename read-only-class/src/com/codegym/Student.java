package com.codegym;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }

    String getClasses() {
        return classes;
    }
}
