package com.qa.java.fundamentals;

public class DataTypes {

	public static void main(String[] args) {
		// comment - will be ignored by the compiler
		/*
		 * Integers byte - 1 byte short - 2 bytes int - 4 bytes long - 8 bytes
		 */

		/*
		 * Variable - address of the memory location where you store the data
		 */
		// datatype variable
		byte age; // -128 to + 127
		age = 35;

		// byte eligibleAge = 20; // not coding standard
		byte eligibleAge;
		eligibleAge = 20;

		byte maleMinAge, femaleMinAge;
		maleMinAge = 25;
		femaleMinAge = 22;

		System.out.println("Age is : " + age + " , Eligible Age : " + eligibleAge);
		System.out.println("Male Minimum Age is : " + maleMinAge + " and Female Min Age : " + femaleMinAge);

		short minSalary;
		minSalary = 30000; // -32768 to +32767

		System.out.println("Min Salary is : " + minSalary + "$");

		int totalSalaryOfEmployee;
		totalSalaryOfEmployee = 435334534;

		long totalSalariesOfAllEmployees;
		totalSalariesOfAllEmployees = 63434634634363463L;

		float averagePrice;
		averagePrice = 33454.345F;

		double averageSalaryOfEmployee;
		averageSalaryOfEmployee = 3453453.345;

		char gender;
		gender = 'M';

		boolean isEligible;
		isEligible = false;

		System.out.println("Is Eligible : " + isEligible);

	}

}
