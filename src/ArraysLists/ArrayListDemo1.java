package ArraysLists;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo1 {
	
   public static void main(String[] args) {
	
	   
	  ArrayList<String> a1= new ArrayList<>();
	  
	  a1.add("java");
	  a1.add("selenium");
	  a1.add("SQL");
	  a1.add("Aptitude");
	  
	  System.out.println(a1);
	  
	  for (int i=0;i<a1.size();i++)
	  {
		  System.out.println(a1.get(i));
	  }
	  for (String temp:a1) {
		  
		  System.out.println(temp);
		  
	  }
	  
	  
	/* ListIterator i1=a1.listIterator();
	 
	 while (i1.hasNext()) {
		 System.out.println(i1.next());
		 
	 }
	 
	 System.out.println("object from backword direction");
	 

	 
	 while (i1.hasPrevious()) {
		 
		 System.out.println(i1.previous());
	 }
	 */
}

}
