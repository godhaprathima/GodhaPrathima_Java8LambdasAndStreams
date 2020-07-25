package com.epam.vnrvjiet.prathima.AverageOfList;
import java.util.OptionalDouble;
import java.util.List;

public class CalculateAverageOfIntegers {
	public OptionalDouble average(List<Integer> ListOfIntegers)
	{
		return ListOfIntegers.stream().mapToInt(number -> number.intValue()).average();
	}

}
