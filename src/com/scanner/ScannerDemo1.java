package com.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
	public static void main(String[] args) {
		
		System.out.println("Enter X value");
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println("Enter Y value");
		
		int y=input.nextInt();
		
		int z=x+y;

		System.out.println("the value of Z is "+z);
		

	}

}
