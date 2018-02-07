import java.util.ArrayList;
import java.util.Collections;
public class TestArrayList {
   public static void main (String [] args) {
   
      //1. create an ArrayList
      ArrayList <Integer> intList = new ArrayList<>();
   
      //2. populate intList
      intList.add(5);
      intList.add(20);
      intList.add(4);
   
      //3. Traverse the List
      System.out.println (intList);
   
      //4. Transverse one by one
      for(int i = 0; i < intList.size(); i++)
         System.out.println((i+1) + "\t" + intList.get(i));
         
      
      //sorting
      Collections.sort(intList);
      
      for(int i = 0; i < intList.size(); i++)
         System.out.println((i+1) + "\t" + intList.get(i));

      //reverse
      for(int i = intList.size() -1; i < 0; i++)
         System.out.println((i+1) + "\t" + intList.get(i));
   

// Test
   
   }
}
