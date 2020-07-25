package com.epam.vnrvjiet.prathima.PalindromeCheckUsingStaticMethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromesSort {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of strings in a list");
		int NumberOfStrings=sc.nextInt();
		String string[]=new String[NumberOfStrings];
		for (int i=0;i<NumberOfStrings;i++)
			string[i]=sc.next();
		
		List<String> ListOfStrings=Arrays.asList(string);
		List<String> palindromes=PalindromesSort.filterList(ListOfStrings,PalindromePredict::predict);
		System.out.println("List of Palindrome strings is :"+palindromes);
		sc.close();
		
	}
	
	public static List<String> filterList(List<String> listOfStrings,Predicate<String> predicate) {
		List<String> palindromesList=new ArrayList<>();
		for(String string:listOfStrings) {
			if(predicate.test(string)) {
				palindromesList.add(string);
				
			}
		}
		return palindromesList;
	}

	

}
