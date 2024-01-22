package com.girmiti.Assignments;

import java.util.function.Predicate;
public class Pallindrome {

	public static void main(String[] args) {
		String input = "Achal";
		
	
		Predicate<String> isPallindrome = s -> {
			String reversed = new StringBuffer(s).reverse().toString();
			return s.equals(reversed);
		};
		
		
		if(isPallindrome.test(input))
		{
			System.out.println(input+ " The string is pallindrome");
		}
		else
		{
			System.out.println(input+ " The string is not a pallindrome");
		}
		
	}
	
}
