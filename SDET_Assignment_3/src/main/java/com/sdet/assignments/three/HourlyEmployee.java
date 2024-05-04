package com.sdet.assignments.three;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(double wage, double hours, String firstName, String lastName, int idNumber) {
        super(firstName, lastName, idNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getEarnings() {
        if (hours <= 40) {
            return hours * wage;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }

    @Override
    public String toString() {
        return "Hourly Employee: " +
                "First Name='" + getFirstName() + '\'' +
                ", Last Name='" + getLastName() + '\'' +
                ", ID Number=" + getIdNumber() +
                ", Wage=" + wage +
                ", Hours=" + hours +
                ", Earnings=" + getEarnings();
    }

    @Override
    public void displayInvoice() {
        System.out.println(toString());
    }
}
