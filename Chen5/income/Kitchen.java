package income;

import java.util.*;

public class Kitchen {

	// opening stock given and put into an array
	public int[] stock = { 120, 75, 75, 120, 65 };

	// initializing the guests into the arraylist 
	public ArrayList<Guest> guestlist;

	// no-arg constructor 
	public Kitchen() {
		guestlist = new ArrayList<>();

	}
	
	// adding guest to methods below
	public void addGuest(Guest g) {
		guestlist.add(g);
		updateStock(g);
	}

	// getting stock from opening stock
	public int[] getStock() {
		return stock;
	}

	// we are updating the stock as more guests come in
	public void updateStock(Guest g) {

			stock[0] = stock[0] - g.getDrink();
			stock[1] = stock[1] - g.getSoup();
			stock[2] = stock[2] - g.getSalad();
			stock[3] = stock[3] - g.getEntree();
			stock[4] = stock[4] - g.getDessert();

	}
   
	// checking stock and when it gets to 4 or below ... we stop.
   public int checkStock(){
	   
	   if(stock[0] <= 4) return -1;
	   if(stock[1] <= 4) return -1;
	   if(stock[2] <= 4) return -1;
	   if(stock[3] <= 4) return -1;
	   if(stock[4] <= 4) return -1;
	   else return 0;
   }  
   
}