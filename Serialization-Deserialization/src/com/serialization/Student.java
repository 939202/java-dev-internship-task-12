package com.serialization;

import java.io.Serializable;

public class Student implements Serializable {

    // Recommended to avoid InvalidClassException
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String course;

    // Sensitive field (will NOT be serialized)
    private transient String password;

    public Student(int id, String name, String course, String password) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.password = password;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Student {" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Course='" + course + '\'' +
                ", Password='" + password + '\'' +
                '}';
    }
}
