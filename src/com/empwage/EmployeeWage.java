package com.empwage;

public class EmployeeWage{

    public static final int isFullTime = 2;
    public static final int isPartTime = 1;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxWorkingHours;
    private int totalEmpWage;

    public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxWorkingHours) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void computeEmpWage() {

        int empHours = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        // Computation
        while (totalWorkingHours <= maxWorkingHours &&
                totalWorkingDays < numOfWorkingDays) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case isFullTime:
                    empHours = 8;
                    break;
                case isPartTime:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            totalWorkingDays++;
            totalWorkingHours += empHours;

            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + totalWorkingHours);
        }
        totalEmpWage = totalWorkingHours * empRatePerHour;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWage DMart = new EmployeeWage("DMart", 20, 20, 100);
        EmployeeWage Reliance = new EmployeeWage("Reliance", 30, 18, 100);
        DMart.computeEmpWage();
        System.out.println(DMart);
        Reliance.computeEmpWage();
        System.out.println(Reliance);

    }
}
	    