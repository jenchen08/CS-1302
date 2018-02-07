//*********************************************
//  Program calculates roots of polynomials    
//  Using the Quadratic Formula                
//*********************************************

// made a package to have the tester class and this class to run together in
// the same folder
package quadraticEquation;

public class QuadraticEquation1 { 
	private double a;
	private double b;
	private double c;

	// Default Constructor
	public QuadraticEquation1() {
		a = 1;
		b = 1;
		c = 1;
	}

	// constructs specific coefficients (a,b,and c) for the polynomial
	public QuadraticEquation1(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Returns coefficient a of the polynomial 
	public double getA() {
		return a;
	}

	// Returns coefficient b of the polynomial
	public double getB() {
		return b;
	}

	// Returns coefficient c of the polynomial
	public double getC() {
		return c;
	}

	// sets a new "a" coefficient to the polynomial
	public void setA(double a) {
		this.a = a;
	}

	// sets a new "b" coefficient to the polynomial
	public void setB(double b) {
		this.b = b;
	}

	// sets a new "c" coefficient to the polynomial
	public void setC(double c) {
		this.c = c;
	}

	// Returns the calculation using the quadratic equation
	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	// Returns the first root from the calculation
	public double getRoot1() {
		// used if statement to check if the root is negative or not
		// if negative, returns zero
		if (getDiscriminant() < 0) {
			return 0;
		}

		return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
	}

	// Returns the second root from the calculation
	public double getRoot2() {
		// used if statement to check if the root is negative or not 
		// if negative, returns zero
		if (getDiscriminant() < 0) {
			return 0;
		}

		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);

	}
}
