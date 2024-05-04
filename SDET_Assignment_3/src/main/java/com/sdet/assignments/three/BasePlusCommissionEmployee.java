package com.sdet.assignments.three;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(double baseSalary, double commissionRate, int grossSales, String firstName, String lastName, int idNumber) {
        super(commissionRate, grossSales, firstName, lastName, idNumber);
        this.baseSalary = baseSalary;
    }


    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getEarnings() {
        return super.getEarnings() + baseSalary;
    }

    @Override
    public String toString() {
        return "Base Plus Commission Employee: " +
                "First Name='" + getFirstName() + '\'' +
                ", Last Name='" + getLastName() + '\'' +
                ", ID Number=" + getIdNumber() +
                ", Commission Rate=" + getCommissionRate() +
                ", Gross Sales=" + getGrossSales() +
                ", Base Salary=" + baseSalary +
                ", Earnings=" + getEarnings();
    }

    @Override
    public void displayInvoice() {
        System.out.println(toString());
    }
}
