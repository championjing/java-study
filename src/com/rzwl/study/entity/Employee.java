package com.rzwl.study.entity;

import org.w3c.dom.NameList;

/**
 * @author : championjing
 * @ClassName: Employee
 * @Description:
 * @Date: 8/2/2019 3:17 PM
 */
public class Employee {
    private long id;
    private int age;
    private String name;
    
    public Employee(){}

    public Employee(int age){
        this.age = age;
    }
    public Employee(String name,int age,long id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
