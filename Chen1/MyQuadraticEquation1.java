package quadraticEquation;

// Imports scanner into class
import java.util.*;

//Tester Class (Driver for QuadraticEquation1)
public class MyQuadraticEquation1 { 

	// Main Method 
	public static void main(String[] args) {
		
		// Invokes default constructor
		QuadraticEquation1 z = new QuadraticEquation1();
		// prints out the equation, number under square root, and let us input new coefficients
		System.out.println("Original quadratic equation qe1:\t" + z.getA() + "X^2 +" + z.getB() + "X +" + z.getC());
		System.out.println("Discriminant =\t" + z.getDiscriminant());
		System.out.println("Enter the three coefficients of the quadratic equation:");

		// Scanner reads the new input
		Scanner coefficients = new Scanner(System.in);
		double apple = coefficients.nextDouble();
		double banana = coefficients.nextDouble();
		double corn = coefficients.nextDouble();
		
		// Invokes constructor with specific coefficients in 2nd equation
		QuadraticEquation1 y = new QuadraticEquation1(apple, banana, corn);
		// prints out the equation, the number under the square root,and roots
		System.out.println("\nOriginal quadratic equation qe2:\t" + y.getA() + "X^2 +" + y.getB() + "X +" + y.getC());
		System.out.println("Discriminant =\t" + y.getDiscriminant());
		System.out.println("Root1 value: \tx1 =\t" + y.getRoot1());
		System.out.println("Root2 value: \tx2 =\t" + y.getRoot2());

		// First equation coefficient "b" updates with new number
		// number under square root updates 
		z.setB(2);
		System.out.println("\nUpdated first quadratic equation \nOriginal quadratic eqation qe1:\t" + z.getA() + "X^2 +"
				+ z.getB() + "X +" + z.getC());
		System.out.println("Discriminant =\t" + z.getDiscriminant());
		
		// use if-else statement to check if roots are negative
		// if negative then prints out the statement instead of the 2 roots
		if (z.getDiscriminant() < 0) {
			System.out.println("The equation has no real roots");
		}

		else {
			System.out.println("Root1 value: \tx1 =\t" + z.getRoot1());
			System.out.println("Root2 value: \tx2 =\t" + z.getRoot2());
		}

		// First equation coefficient "c" updates with new number
		// number under square root updates 
		z.setC(3);
		System.out.println("\nUpdated first quadratic equation \nOriginal quadratic eqation qe1:\t" + z.getA() + "X^2 +"
				+ z.getB() + "X +" + z.getC());
		System.out.println("Discriminant =\t" + z.getDiscriminant());
		
		// use if-else statement to check if roots are negative
		// if negative then prints out the statement instead of the 2 roots
		if (z.getDiscriminant() < 0) {
			System.out.println("The equation has no real roots");
		}

		else {
			System.out.println("Root1 value: \tx1 =\t" + z.getRoot1());
			System.out.println("Root2 value: \tx2 =\t" + z.getRoot2());
		}
		
		// close scanner
		coefficients.close();
	}

}
