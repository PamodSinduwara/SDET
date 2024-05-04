package com.sdet.assignments.three;

public class CommissionEmployee extends Employee{
    private double commissionRate;
    private int grossSales;

    public CommissionEmployee(double commissionRate, int grossSales, String firstName, String lastName, int idNumber) {
        super(firstName, lastName, idNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }


    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public double getEarnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return "Commission Employee: " +
                "First Name='" + getFirstName() + '\'' +
                ", Last Name='" + getLastName() + '\'' +
                ", ID Number=" + getIdNumber() +
                ", Commission Rate=" + commissionRate +
                ", Gross Sales=" + grossSales +
                ", Earnings=" + getEarnings();
    }

    @Override
    public void displayInvoice() {
        System.out.println(toString());
    }
}
