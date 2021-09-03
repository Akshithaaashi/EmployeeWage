package com.empwage;

public class EmployeeWage{


	// Instance variables
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	private final String company;
	private final int wagePerHour;
	private final int workingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	// parameterised Constructor
	public EmployeeWage(String company, int wagePerHour, int workingDays, int maxHoursPerMonth) 
	{
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.workingDays = workingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	// Calculating working hours and total wage
	public void computeWage() {
		// Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < workingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			 System.out.println("Day : " + totalWorkingDays + " Emp Hr : " + empHrs);
		}
		totalEmpWage = totalEmpHrs * wagePerHour;
	
	}
	
	public static void main(String[] args) 
	{
		//save the total wages for each company
		EmployeeWage  WIPRO= new EmployeeWage("WIPRO", 20, 20, 100);
		EmployeeWage  TCS= new EmployeeWage("TCS", 10, 40, 200);
		WIPRO.computeWage(); // Compute for WIPRO/
		System.out.println("Total wage for wipro"+WIPRO);
		TCS.computeWage();// Compute for TCS
		System.out.println("Total wage for TCS"+TCS);
	}
}
	    