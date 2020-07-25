package com.epam.vnrvjiet.prathima.StringPredictionsUsingStreams;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class StreamAPIexample {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of strings in a list");
		int NumberOfStrings=sc.nextInt();
		String string[]=new String[NumberOfStrings];
		for (int i=0;i<NumberOfStrings;i++)
			string[i]=sc.next();
		
		List<String> ListOfStrings=Arrays.asList(string);
		
		StringFilterClass filterclass=new StringFilterClass();
		List<String> FilteredStrings=filterclass.FilterStrings(ListOfStrings);
		System.out.println("Required filtered strings are:"+FilteredStrings);
		sc.close();
		
	}

}
