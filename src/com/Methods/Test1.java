package com.Methods;

public class Test1 {
	
	int var1=75;
	int var2=89;
	int var3=56;
	int var4;
	 
	public void addition() {
		var4=var1+var2;
		System.out.println("addition of var1+var2:"+var4);
		
	}
     
	 public void subtraction() {
		 var4=var2-var3;
		 System.out.println("subtraction of var2-var3:"+var4); 
	 }
	 
	 public void multiplication() {
		 var4=var3*var2;
		 System.out.println("multiplication of var3*var2:"+var4);
		 
	 }
	 
	 static Test1 add=new Test1();
	 public static void main(String[] args) {
		 add.addition();
		 add.subtraction();
		 add.multiplication();
		
		
		
	}
	 
}
