package com.girmiti.Assignments;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,4,8,9,10,20,15,25);
		
		int SumOfSquareOfOddNos = calulateSumOfEvenNo(numbers, n -> n%2!=0);
		int SumOfSquareOfEvenNos = calulateSumOfEvenNo(numbers, n -> n%2==0);
		
		System.out.println("The sum of Even no is: "+SumOfSquareOfEvenNos);
		System.out.println("The sum of Odd no is: "+SumOfSquareOfOddNos);

	}
	
	public static int calulateSumOfEvenNo(List<Integer> numbers, NoFilter filter)
	{
		return   numbers.stream()
				.filter(filter::test)
				.mapToInt(n -> n * n)
				.sum();
		
	}
}

interface NoFilter
{
	boolean test(int number);
}
