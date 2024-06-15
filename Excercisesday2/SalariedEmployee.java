package com.hcltech.Excercisesday2;

public class SalariedEmployee {
 private String name;
 private double salary;

 // Constructor
 public SalariedEmployee(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 // Accessor methods
 public String getName() {
     return name;
 }

 public double getSalary() {
     return salary;
 }

 // Mutator methods
 public void setName(String name) {
     this.name = name;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }

 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;

     SalariedEmployee that = (SalariedEmployee) obj;

     if (Double.compare(that.salary, salary) != 0) return false;
     return name != null ? name.equals(that.name) : that.name == null;
 }

 @Override
 public String toString() {
     return "SalariedEmployee{" +
             "name='" + name + '\'' +
             ", salary=" + salary +
             '}';
 }
}
