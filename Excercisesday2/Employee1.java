package com.hcltech.Excercisesday2;
class Employee1{
    protected String name;
    protected String dept;
    protected String desig;
    protected double basic;

    public Employee1(String name, String dept, String desig, double basic) {
        this.name = name;
        this.dept = dept;
        this.desig = desig;
        this.basic = basic;
    }

    public void employeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Designation: " + desig);
    }

    public void calculateSalary() {
        // Default implementation or leave abstract if subclasses override
    }
}
