package com.ds.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Employee {
    private int id;
    private int age;
    private String name;
    private String departmentName;

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", age=" + age +
            ", name='" + name + '\'' +
            ", departmentName='" + departmentName + '\'' +
            '}';
    }


    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, 26, "omprakash");
        Employee e2 = new Employee(102, 27, "rajiv");
        Employee e3 = new Employee(103, 28, "albel");
        Employee e4 = new Employee(104, 29, "reehan");
        List<Employee> ls = new ArrayList<>();
        ls.add(e1);
        ls.add(e2);
        ls.add(e3);
        ls.add(e4);

        System.out.println(ls);

        Stream<Employee> sorted = ls.stream().sorted((o1, o2) -> o1.name.compareTo(o2.name));
//        ls.stream().so

//        sorted.sorted()


    }
}
