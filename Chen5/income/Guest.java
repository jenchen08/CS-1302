package income;

//***************************************************************************************
// Purpose: Practice with Inheritance, polymorphism, and random class
//
// Input: Stock of guest
// Output:
//
// Author: Jenny Chen
// Course: 1302 A
// Date: 2/7/18
// Program: Guest.java
// **************************************************************************************

public class Guest {

	// declarations
	public int drink;
	public int soup;
	public int salad;
	public int entree;
	public int dessert;

	//constructor 
	public Guest(int drink, int soup, int salad, int entree, int dessert) {
		this.drink = drink;
		this.soup = soup;
		this.salad = salad;
		this.entree = entree;
		this.dessert = dessert;
	}
	// getting stock from the constructor
	public int getDrink() {
		return drink;
	}

	public int getSoup() {
		return soup;
	}

	public int getSalad() {
		return salad;
	}

	public int getEntree() {
		return entree;
	}

	public int getDessert() {
		return dessert;
	}

}