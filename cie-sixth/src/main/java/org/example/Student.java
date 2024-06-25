package org.example;

public class Student {
    int id;
    int totalMarks;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", totalMarks=" + totalMarks +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
