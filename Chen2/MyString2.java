//*********************************************************************************
//Purpose: Uses the String class. Reads the array of characters. (Reverses it,
//         capitalize it or lowercase it, and etc.
//
//Author: Jenny Chen
//
//Course: 1302A        
//
//Date: 1/16/2018
//
//Program: #2(MyString2.java)
//********************************************************************************

public class MyString2 {
	// declarations
	private char[] buffer;

	// Constructor 
   public MyString2(String s) {

		// assigning buffer a length in the array
		buffer = new char[s.length()];

		// for-loop reads the size of the string
		for (int i = 0; i < s.length(); i++) {
			buffer[i] = s.charAt(i);
		}
	}
   // Constructor 
	public MyString2(char[] s) {
		
      //assigning buffer a length in the array
      buffer = new char[s.length];
      
      // for-loop reads the size of string
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = s[i];
		}
	}
   // Compares the string if it's the same or different
	public int compare(MyString2 s) {
      
      //use for-loop to get the size of buffer
		for (int i = 0; i < buffer.length; i++) {
			//uses if-else statement to comapare letter is bigger or smaller
         if (buffer[i] < s.buffer[i]) {
				return 1;
			} else if (buffer[i] > s.buffer[i]) {
				return -1;
			}
		}
		// return zero if the string is the same size
      return 0;

	}

   // Reads the letter at a certain index
	public char charAt(int index) {
      //returns the letter at the index 
		return buffer[index];
	}

	// read charaters from the beginning of a certain index
   // to the end of a certain index
   public String substring(int start, int end) {
		// create empty string
      String result = " ";
      
      // for-loop reads the start of array to the end
      // assign buffer to string 
		for (int i = start; i < end; i++) {
			result += buffer[i];
		}
      // return the buffer as string
		return result;
	}

	//It cuts off at the beginning of a certain index
   // reads to the end of the array
   public String substring(int begin) {
		// empty string
      String result = " ";

		// for-loop reads length of array
      for (int i = begin; i < buffer.length; i++) {
			result += buffer[i];
		}
		//returns as string
      return result;
	}

	public MyString2 toUpperCase() {
		// reads length of buffer and capitalize each
      // character
      for (int i = 0; i < buffer.length; i++) {
			buffer[i] = Character.toUpperCase(buffer[i]);
		}
		// returns the new class method 
      return this;
	}

	public MyString2 toLowerCase() {
		// reads the length of array and
      // lowercase each character in array
      for (int i = 0; i < buffer.length; i++) {
			buffer[i] = Character.toLowerCase(buffer[i]);
		}
      // return new class method
		return this;
	}

	public boolean equals(MyString2 s) {
		// reads the length of array
      for (int i = 0; i < buffer.length; i++) {
			
         // if statement to see if the strings are the same
         // if not, return false
         // if it is, return true
         if (this.buffer[i] != s.buffer[i]) {
				return false;
			}
		}
		return true;
	}

	// copies buffer array into a new array
   public char[] toChars() {
		char[] result = new char[buffer.length];
		for (int i = 0; i < buffer.length; i++) {
			result[i] = buffer[i];
		}
		//returns new array
      return result;
	}
   
   // Reads the number of characters in the array
	public int length() {
		return buffer.length;
	}

	public MyString2 reverse() {
		// assign result the buffer array length
      char[] result = new char[buffer.length];
		// declaration for result array
      int position = 0;

		// 1st for-loop reads the array backwards
      for (int i = buffer.length - 1; i >= 0; i--) {
			// the buffer array is copied into the result array
         result[position] = buffer[i];
			// starting from zero reads up to the length of the array
         position++;
		}
		// for-loop reads the result array and puts it back into the buffer array  
      for (int i = 0; i < buffer.length; i++) {
			buffer[i] = result[i];
		}
		//returns the class
      return this;
	}

	public String toString() {
		// make an empty string
      String result = " ";
		// for-loop reads length of buffer
      for (int i = 0; i < buffer.length; i++) {
			result += buffer[i];
		}
		// returns the characters in the buffer as string 
      return result;
	}
}
   
    