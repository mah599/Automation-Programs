package ArraysLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		
		List<Integer> a1=new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		System.out.println(a1);
		
		for (int i=0;i<a1.size();i++) {
			
			System.out.println(a1.get(i));
			
		}
		
		System.out.println("--------------------------------");
		for (Integer temp:a1) {
			
			System.out.println(temp);
		}
		
		
		
	}

}
