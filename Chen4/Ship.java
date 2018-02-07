//*********************************************************************
//Purpose:     Main Class
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
public class Ship implements Comparable <Ship> {
   
   //declarations
   public String name;
   public int year;
   
   // default constructor 
   public Ship(){

       name = "No Name";

       year = 1776;

    }
    
    // over-loaded constructor with name and year
    public Ship (String name, int year) {

       this.name = name;

       this.year = year;

    }
    
    // Mutators and accessors  
    public String getName() {

        return name;

    }
    public void setName(String name) {
        
        this.name = name;
    }

    public int getYear() {

        return year;

    }

    public void setYear(int year) {

        this.year = year;

    }
    
    // overrided method of comparable interface 
    
    @Override
    
    public int compareTo(Ship s) {
      return new Integer(getYear()).compareTo(s.getYear());    
    }
    
    @Override
   
    //Print out name and year of the ship   
    public String toString(){
      System.out.print("Basic Ship");
      return "\nShip Name\t" + getName() + "\nShip Year\t" + getYear();


    }

}
