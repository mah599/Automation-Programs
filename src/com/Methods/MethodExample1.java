
package com.Methods;

public class MethodExample1 {
	int var1=8;
	int var2=4;
	int var4=2;
	int var5=3;

	
	
	public void Addition() {
		int var1=52;
	    int var2=41;
		int var3;
		 
		var3=var1+var2+var4+var5;
		
		System.out.println("the adition of var3 is :="+var3);
		
	}
	public static void main(String[] args) {
		
		MethodExample1 m1=new MethodExample1();
		
		m1.Addition();//method calling statements
		m1.subtraction();
		m1.multiplication();
		
		
	}
	public void subtraction() {
		 
		//int var1=74;
		//int var2=41;
		int var3;
		var3=var1-var2-var4-var5;
		
		System.out.println("the subtraction of two numbers is :="+var3);
		
	}
	
	public void multiplication(){
		
		int var3;

		var3=var1*var2*var4*var5;
		System.out.println("the multiplication of two nubers is :="+var3);
		
	}

}
