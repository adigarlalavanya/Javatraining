package com.hcltech.Excercisesday2;

public class Doctor extends SalariedEmployee {
    private String specialty;
    private double officeVisitFee;

    // Constructors
    public Doctor(String name, double salary, String specialty, double officeVisitFee) {
        super(name, salary);
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }

    // Accessor methods
    public String getSpecialty() {
        return specialty;
    }

    public double getOfficeVisitFee() {
        return officeVisitFee;
    }

    // Mutator methods
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setOfficeVisitFee(double officeVisitFee) {
        this.officeVisitFee = officeVisitFee;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Doctor doctor = (Doctor) obj;

        if (Double.compare(doctor.officeVisitFee, officeVisitFee) != 0) return false;
        return specialty != null ? specialty.equals(doctor.specialty) : doctor.specialty == null;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", specialty='" + specialty + '\'' +
                ", officeVisitFee=" + officeVisitFee +
                '}';
    }
}
