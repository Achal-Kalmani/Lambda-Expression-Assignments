package com.girmiti.Assignments;
import java.util.function.*;
public class Concatinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "World!";
		
	BiFunction<String, String, String> afterconcatination = (s1,s2) -> s1 + s2;
	String result = afterconcatination.apply(str1, str2);
	
	System.out.println("The String After Concatination is: " +result);
	}

}
