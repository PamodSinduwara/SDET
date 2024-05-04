package com.sdet.assignments.three;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(double weeklySalary, String firstName, String lastName, int idNumber) {
        super(firstName, lastName, idNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getEarnings() {
        return weeklySalary * 4;
    }

    @Override
    public String toString() {
        return "Salaried Employee: " +
                "First Name='" + getFirstName() + '\'' +
                ", Last Name='" + getLastName() + '\'' +
                ", ID Number=" + getIdNumber() +
                ", Weekly Salary=" + weeklySalary +
                ", Earnings=" + getEarnings();
    }

    @Override
    public void displayInvoice() {
        System.out.println(toString());
    }
}

