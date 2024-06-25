package com.example.ciesecond;

public class Department {
    int id;

    String name;
    College college;

    public Department(College college){
        this.college = college;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name=" + name +
                ", college=" + college +
                '}';
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
