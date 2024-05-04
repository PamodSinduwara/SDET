package com.sdet.assignments.three;

public class PayrollSystem {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee(50000.00,"Sinduwara", "Gunawardana", 1);
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.getEarnings());

        CommissionEmployee commissionEmployee = new CommissionEmployee(12.00,600000, "Sinduwara", "Gunawardana",2);
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.getEarnings());

        HourlyEmployee hourlyEmployee = new HourlyEmployee(300,24, "Sinduwara", "Gunawardana", 3);
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.getEarnings());

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(300,24, 300, "Gunawardana", "Pamod", 2);
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.getEarnings());
    }
}
