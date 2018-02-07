//*********************************************************************
//Purpose:     Subclass of Ship Class
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
public class CruiseShip extends Ship {
   
   // declartions
   public int numPassengers;

    // default constructor
    public CruiseShip() {

        numPassengers = 1000;

    }
    
    // over-loaded constructor with name and number of
    // passengers  
    public CruiseShip(String name, int np) {
      this.name = name;
      
      numPassengers = np;
    }
    
    //over-loaded constructor with name, year, and 
    // number of passengers 
    public CruiseShip (String name, int year, int np) {

       super(name,year);

       numPassengers = np;

    }

 
    // accessors and mutators   
    public int getNumPassengers() {

        return numPassengers;

    }

 
    public void setNumPassengers(int numPassengers) {

        this.numPassengers = numPassengers;

    }
    //Prints out name,year, and passengers 
    
    public String toString(){
    System.out.print("Cruise Ship");
      return "\nShip Name\t" + getName() + "\nShip Year\t" + getYear()
             + "\nNumber of Passengers\t" + getNumPassengers();

    }
}
