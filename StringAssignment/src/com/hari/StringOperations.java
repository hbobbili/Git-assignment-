package com.hari;

public class StringOperations {
	public static void main(String[] args) {
		String str1 = "Java String pool refers to collection of strings which are stored in heap memory";
		String str2 = "java string pool refers to collection of strings which are stored in heap memory";
	
		System.out.println(str1.replace('a' , '$'));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		if (str1.contains("collection")) {
			System.out.println("contains");
		}
		else
		{
			System.out.println("Does not contains");
		}
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str1));
		
	}

}