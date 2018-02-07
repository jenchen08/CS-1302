package income;
import java.util.*;
//***************************************************************************************
//Purpose: Practice with Inheritance, polymorphism, and random class	
//
//Input: Stocks from kitchen and guest set orders
//Output: The total income, guest count, number of orders, and closing stock			
//
//Author: Jenny Chen
//Course: 1302 A
//Date: 2/7/18
//Program: MyDiner5.java
//**************************************************************************************
public class MyDiner5 {
	//declarations for the random class
	public static int numFam;
	public static int numCouple;
	public static int numInd;
	public static int numGp;

	//main method
	public static void main(String[] args) {

		// created a new object for kitchen to use in the loop
		Kitchen k = new Kitchen();
		
		// using a do-while loop to check the stock, update the stock as guests come in
		do {

			Guest g1 = generateGuest();
			k.addGuest(g1);
		}

		while (k.checkStock() != -1);
		
		// my output for income for the day, guests that came in, and closing stock 
		System.out.printf("%s$%d%s\n\n","********** Total income for the day: ",((numFam*65)+(numCouple*30)+(numInd*12)+(numGp*72))," ********************");
		int total = ((numFam) + (numCouple) + (numInd) + (numGp));
		System.out.println("** Guest type count **");
		System.out.printf("%s%d\n%s%d\n%s%d\n%s%d\n\n","Family: ", numFam, "Couple: ", numCouple, "Individual: ", numInd, "Group: ", numGp);
		System.out.println("************* Total number of orders: " + total + " ******************");
		System.out.println("\n** Closing stock **");
		
		
			System.out.println("Drink: " + k.stock[0]);
			System.out.println("Soup: " + k.stock[1]);
			System.out.println("Salad: " + k.stock[2]);
			System.out.println("Entree: " + k.stock[3]);
			System.out.println("Dessert: " + k.stock[4]);
		
		

	}
	// Random class is used here to generate the number of guests that come in for the day
	public static Guest generateGuest() {
		Random n = new Random();
		int num;
		num = n.nextInt(4);

		Guest g;

		switch (num) {

		case 0:
			g = new Family();
			numFam++;
			break;
		case 1:
			g = new Couple();
			numCouple++;
			break;
		case 2:
			g = new Individual();
			numInd++;
			break;
		case 3:
			g = new Group();
			numGp++;
			break;
		default:
			g = new Individual();
		}
		return g;

	}

}