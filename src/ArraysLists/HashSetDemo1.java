package ArraysLists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		
		Set<String>a1=new HashSet<String>();
		
		a1.add("hii");
		a1.add("welcome");
		a1.add("to my world");
		a1.add("selenium");
		
		System.out.println(a1.size());
		
		
		
		System.out.println(a1);
		a1.add("java");
		a1.add("automation");
		a1.add("selenium tool");
		a1.add("aptitude");
		
		
		
		System.out.println(a1.size());
		
		System.out.println(a1);
		
		for (String temp:a1) {
			System.out.println(temp);
			
		}
		
		Iterator<String> a2=a1.iterator();
		
		while (a2.hasNext()) {
			System.out.println(a2.next());
		}
		
		

	}

}
