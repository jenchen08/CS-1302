//*********************************************************************
//Purpose:     Tester to invoke and use various ship types
//Input:       None
//Output:      None
//
//Course:      CS1302
//
//Author:      Jenny Chen
//
//Date:        1/24/2018
//
//Program:     MyShip4.java
//********************************************************************
import java.util.Collections;
import java.util.ArrayList;
public class MyShip4{
	public static void main(String[] args){
		
		//Creates an ArrayList to hold all of the ships
		ArrayList <Ship> ships = new ArrayList<>();
		
		//Populate ArrayList with a number of ship types
		ships.add(new Ship("Basic", 1955));
      ships.add(new CargoShip());
      ships.add(new CruiseShip());
		ships.add(new CargoShip("Panama", 250));
      ships.add(new CargoShip("Valdosta", 2001, 500));
      ships.add(new CargoShip("Atlanta", 1996, 3700));
      ships.add(new CruiseShip("Paradise", 3000));
      ships.add(new Ship());
		ships.add(new CargoShip("Rio", 250));
      ships.add(new CruiseShip("Dream", 2000));
		ships.add(new CruiseShip("Future", 4500));
		ships.add(new CargoShip("Cuba", 432));
		ships.add(new Ship("George Washington", 1732));
		
		
      //1.  Traverse the arrayList and display all ship informtion.
      for(Ship s: ships){
         System.out.println(s);
         System.out.println("");
      }
		
      //2.  Sort all ships by year built on assending order 
         Collections.sort(ships);
         
         System.out.println("\nSorted by year built\n");
         
		   
      //3.  Traverse the arrayList and display all ship informtion.
      for (Ship sort : ships) {
			   System.out.println(sort + "\n");   
      }

      //4.  Compute the total number of passengers in all cruise ships
      //5.  Compute the total tonnage of al Cargo ships
      int total_np = 0;
      int total_tcs = 0;
      for (Ship t: ships) {
         if (t instanceof CruiseShip) {
            CruiseShip cs = (CruiseShip)t;
				total_np = total_np + cs.getNumPassengers();
			}
			if(t instanceof CargoShip) {
            CargoShip cs = (CargoShip)t;
				total_tcs = total_tcs + cs.getWeight();
			   
         }

      }      
      
      //6.  Display both total number of passengers and total tonnage
      //    You should get the following totals:
      //    Total Tonnage for Cargo Ships      15132
      //    Total Number of Passengers         10500      
      
      System.out.printf("\n%-20s%-20d\n", "Total Tonnage for Cargo Ships\t  ", total_tcs);
      System.out.printf("\n%-20s%-20d\n", "Total Number of Passengers\t     ", total_np);
   }
}
