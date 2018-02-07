package employeeClass;
//***************************************************************************************
//Purpose: Practice with Inheritance, abstract classes, instanceof, and comparable	
//
//Input: subclass
//Output: 				
//
//Author: Jenny Chen
//Course: 1302 A
//Date: 1/22/18
//Program: PieceWorker.java
//**************************************************************************************
public class PieceWorker extends Employee{
   
   //declarations 
   private double wage;
   private int pieces;
   
   // five-argument constuctor
   public PieceWorker (String first, String last, String ssn,
      double wagePerP, int p) {
   
    // call superclass constructor
    super( first, last, ssn );        
      setWage( wagePerP );
      setPieces( p );
   }
   
   // Set the wage
   public void setWage( double wagePerP ) { 
      //if statement
      wage = ( wagePerP > 0 ? wagePerP : 0 ); 
   }
   
   // Set the number of items output
   public void setPieces( int p ) { 
      //if statement
      pieces = ( p > 0 ? p : 0 ); 
   }
   
   // return wage of pieces
   public double getWage() {
      return wage;
   }
   
   // return pieces
   public int getPieces() {
      return this.pieces;
   }

   // Determine the PieceWorker's earnings
   public double earnings() { 
      return wage * pieces; 
   }
   // return String representation of PieceWorker object
   public String toString() {
      return String.format( "%s: %s\n%s: $%,.2f;%s:%d\n%s: $%,.2f", 
         "Piece Worker", super.toString(), 
         "Wage per piece", getWage(), 
         " Pieces produced", getPieces(),
         "Earnings", earnings()
          );
   }  
}
   
   