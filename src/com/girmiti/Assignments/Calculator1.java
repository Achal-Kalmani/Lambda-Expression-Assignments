package com.girmiti.Assignments;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To Calculator");
		
		System.out.println("Enter The First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter The Second Number: ");
		int b = sc.nextInt();
		
		System.out.println("Press 1 For Addition");
		System.out.println("Press 2 For Subtraction");
		System.out.println("Press 3 For Multiplication");
		System.out.println("Press 4 For Division");
		System.out.println("Press 5 For Modulus");
		
		int option = sc.nextInt();
		
		
		calculator operate = null; 
		
			switch(option) {
			case 1 : operate = (x,y) -> x + y;
					break;
			
			case 2:  operate = (x,y) -> x - y;
			break;
			
			case 3:  operate = (x,y) -> x * y;
			break;
			
			case 4:  operate = (x,y) -> x / y;
			break;
			
			case 5:  operate = (x,y) -> x % y;
			break;
			
			default : System.out.println("Invalid option");
			
		}
			double res = operate.cal(a, b);
			System.out.println("The calculation is: " +res);
		

	}

}

interface calculator
{
	double cal(int a, int b);
}