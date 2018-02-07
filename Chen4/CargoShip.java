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
//Program:     CargoShip.java
//********************************************************************
public class CargoShip extends Ship {
   
   // declarations
   public int weight;

     
   // default constructor
    public CargoShip() {

        weight = 10000;

    }

    // overloaded constructor with name and weight
    public CargoShip(String name, int weight) {
      
      this.name = name;
     
      this.weight = weight;        
    }
    // overloaded constructor with name, year, and ship tonnage
    public CargoShip (String name, int year, int w) {

       super(name,year);

       weight = w;

    }

     
   //accessors and mutators
    public int getWeight() {

        return weight;

    }

 

    public void setWeight(int weight) {

        this.weight = weight;

    }

 
   // printing out name, year, and cargo capacity 
    public String toString(){
      System.out.print("Cargo Ship");
      return "\nShip Name\t" + getName() + "\nShip Year\t" + getYear() 
             + "\nCargo Capacity\t" + getWeight();

    }
}
