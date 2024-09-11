	package com.Exception;

import java.util.Scanner;

public class ExceptionHandlingDemo1 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter X value");
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println("enter Y value");
		
		int y=input.nextInt();
		
		try {
			
		
		int z=x/y;
		System.out.println("the value of z is "+z);
		}
		catch (ArithmeticException e){
			System.out.println(e.getMessage());
			
			e.printStackTrace();
			System.out.println("enter non zero value of y   ");
			
		}
		finally {
			System.out.println("final block is excuted");
		}
		
		System.out.println("end of program");
	}

}
