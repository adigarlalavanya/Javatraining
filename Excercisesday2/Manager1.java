package com.hcltech.Excercisesday2;

class Manager1 extends Employee1 {
    public Manager1(String name, String dept, String desig, double basic) {
        super(name, dept, desig, basic);
    }

    @Override
    public void calculateSalary() {
        double salary = 10 * basic;
        System.out.println("Manager's Salary: " + salary);
    }
}

