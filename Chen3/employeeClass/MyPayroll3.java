package employeeClass;

//***************************************************************************************
//Purpose: Practice with Inheritance, abstract classes, instanceof, and comparable	
//
//Input: Arraylist of employees
//Output: Employees and their earnings				
//
//Author: Jenny Chen
//Course: 1302 A
//Date: 1/22/18
//Program: MyPayroll3.java
//**************************************************************************************
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;

public class MyPayroll3 {
	// **********************************************************************************
	// main: declare needed data structures, populate arraylist, and process records
	// **********************************************************************************
	public static void main(String args[]) {

		DecimalFormat df = new DecimalFormat("##,###,###.##");
		ArrayList<Employee> employee = new ArrayList<>();

		// populate arraylist
		employee.add(new SalariedEmployee("John", "Smith", "111-11-1111", 48000.00));
		employee.add(new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40));
		employee.add(new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06));
		employee.add(new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300));
		employee.add(new PieceWorker("Rick", "Bridges", "555-55-5555", 2.25, 400));
		employee.add(new SalariedEmployee("Joe", "Jones", "999-99-9999", 68800.00));
		employee.add(new SalariedEmployee("Chris", "Smith", "888-88-8888", 75432.00));
		employee.add(new HourlyEmployee("Sam", "Price", "777-77-7777", 25.75, 25));
		employee.add(new CommissionEmployee("Beth", "Jones", "555-55-5555", 20000, .07));
		employee.add(new BasePlusCommissionEmployee("Matt", "Lewis", "123-45-6789", 10000, .05, 500));
		employee.add(new PieceWorker("Zac", "Bridges", "123-44-5555", 5.25, 200));
		employee.add(new SalariedEmployee("Emily", "Smith", "123-55-6666", 100000.00));

		// 1. Display content of Arraylist
		System.out.println("Oringinal Employees List:\n");
		for (Employee e : employee) {
			System.out.println(e);
			System.out.println(" ");
		}
		// 2. Change every Price's last name to your last name.
		// System.out.println("\nEmployees List after changing Price to your last
		// name:\n");

		for (Employee c : employee) {
			if (c.getLastName().equals("Price")) {
				c.setLastName("Chen");
			}

		}

		// 3. Sort the items in the arraylist based on earning
		Collections.sort(employee);

		System.out.println("\nEmployees List after changing Price to your last name:\n");

		// 4. Display only first and last name of all employees with their earnings
		int i = 1;
		for (Employee e : employee) {
			System.out.printf("\n%-5d%-10s%-10s$%,.2f\n", i, e.getFirstName(), e.getLastName(), e.earnings());
			i++;
		}

		// 5. Compute and display the total earning of each employee category
		// and the total earnings for all employees.
		System.out.printf("\n\n%-20s%-20s\n", "Employe Type", "\t\t\tTotal Earning");
		// counters (seperate values)
		double big_total= 0;
		double hr_total = 0;
		double cm_total = 0;
		double bp_total = 0;
		double se_total = 0;
		double pw_total = 0;
		for(Employee e: employee) {
			// nested if-statement 
			if(e instanceof SalariedEmployee) {
				se_total += e.earnings();
			}
			
			if (e instanceof PieceWorker) {
				pw_total += e.earnings();
			}
			
			if (e instanceof HourlyEmployee) {
				hr_total += e.earnings();
			}
			
			if (e instanceof BasePlusCommissionEmployee) {
				bp_total += e.earnings();
			}
			if(e instanceof CommissionEmployee) {
				cm_total += e.earnings();
			}
			
			//total of earnings for all employees
			big_total = big_total + e.earnings();
		}
		System.out.printf("\n%-20s$%,.2f\n", "Salaried Employees:\t\t\t", se_total);
		System.out.printf("\n%-20s$%,.2f\n", "PieceWorker Employees:\t\t\t  ", pw_total);
		System.out.printf("\n%-20s$%,.2f\n", "Hourly Employees:\t\t\t  ", hr_total);
		System.out.printf("\n%-20s$%,.2f\n", "BasePlus Commission Employees:\t\t  ", bp_total);
		System.out.printf("\n%-20s$%,.2f\n", "Commission Employees:\t\t\t  ", cm_total);
		System.out.printf("\n%-20s$%,.2f\n", "Total Earnings for all Employees is:\t", big_total);

	} // end main
	
} // end class MyPayroll3
