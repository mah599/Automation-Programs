package com.Exception;

import java.util.Scanner;

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		
		
		System.out.println("enter X value");
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println("enter Y value");
		
		int y=input.nextInt();
		
		try {
		int z=x/y;
		
		System.out.println("the value of z is"+z);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
			e.printStackTrace();
			System.out.println("the value of non zero y...");
		}
		
		finally {
			System.out.println("final block excuted");
			
		
		}
		
		System.out.println("end of program");
		
	}

}
