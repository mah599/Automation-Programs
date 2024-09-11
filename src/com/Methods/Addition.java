package com.Methods;

public class Addition {

	int var1=856;
	int var2=235;
	int var3;
	static Addition addition=new Addition();
    public static void main(String[] args) {
		
	addition.add();	
	addition.substraction();
	addition.multiplication();
		
	}
	
	public void add(){
		
		var3=var1+var2;
		
		System.out.println("addition of var1 and var2:"+var3);
	}
	
	
	public void substraction() {
		var3=var2-var1;
         System.out.println("substraction of var2 and var3:"+var3);		
	}
	 
	public void multiplication() {
		var3=var1*var2;
		System.out.println("multiplication of var1 and var2:"+var3);
	}
	
}
