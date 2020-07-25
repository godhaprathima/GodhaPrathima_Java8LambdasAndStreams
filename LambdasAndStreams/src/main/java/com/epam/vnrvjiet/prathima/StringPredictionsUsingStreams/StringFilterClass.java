package com.epam.vnrvjiet.prathima.StringPredictionsUsingStreams;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilterClass {
	public List<String> FilterStrings(List<String> ListOfStrings)
	{
		return ListOfStrings.stream().filter(string->string.charAt(0)=='a'&&string.length()==3).collect(Collectors.toList());
	}

}
