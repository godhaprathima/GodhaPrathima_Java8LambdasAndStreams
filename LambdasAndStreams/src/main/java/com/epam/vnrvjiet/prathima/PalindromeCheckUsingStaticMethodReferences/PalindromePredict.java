package com.epam.vnrvjiet.prathima.PalindromeCheckUsingStaticMethodReferences;

public class PalindromePredict {
	public static boolean predict(String string)
	{
		String reverse="";
		for(int i=string.length()-1;i>=0;i--)
		{
			reverse = reverse + string.charAt(i);  
		}
		return string.contentEquals(reverse);
	}

}
