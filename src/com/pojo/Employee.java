package com.pojo;

public class Employee {
    private int id;
    private String dept;
    private int salary;

    public Employee(int id, String dept, int salary) {
        super();
        this.id = id;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
