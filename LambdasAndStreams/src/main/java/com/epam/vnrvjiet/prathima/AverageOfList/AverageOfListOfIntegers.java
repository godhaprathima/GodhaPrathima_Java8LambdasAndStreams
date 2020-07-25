package com.epam.vnrvjiet.prathima.AverageOfList;
import java.util.*;

public class AverageOfListOfIntegers {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Integers to be averaged");
		int NumberOfIntegers=sc.nextInt();
		Integer array[]=new Integer[NumberOfIntegers];
		System.out.println("Enter "+NumberOfIntegers+" Integers");
		for(int i=0;i<NumberOfIntegers;i++)
		{
			array[i]=sc.nextInt();
		}
		List<Integer> ListOfNumbers=Arrays.asList(array);
		
		CalculateAverageOfIntegers averageOfList=new CalculateAverageOfIntegers();
		
		OptionalDouble averageofListOfIntegers=averageOfList.average(ListOfNumbers);
		System.out.println("Average of List of Integers is:"+averageofListOfIntegers);
		sc.close();	
	}

}
