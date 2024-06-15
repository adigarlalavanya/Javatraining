package com.hcltech.Excercisesday2;

class Clerk1 extends Employee1 {
    public Clerk1(String name, String dept, String desig, double basic) {
        super(name, dept, desig, basic);
    }

    @Override
    public void calculateSalary() {
        double salary = 3 * basic;
        System.out.println("Clerk's Salary: " + salary);
    }
}
