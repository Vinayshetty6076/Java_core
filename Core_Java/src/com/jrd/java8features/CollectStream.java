package com.jrd.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectStream {

	public static void main(String[] args) 
	{
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("M2",2021,"A2"));
		movieList.add(new Movie("M1",2020,"A1"));
		movieList.add(new Movie("Master",2021,"Vijay"));
		movieList.add(new Movie("Viswasam",2019,"Ajith"));
		movieList.add(new Movie("Master",2020,"Vijay"));
		movieList.add(new Movie("Viswasam",2020,"Ajith"));
		
		List<String> moviesName = movieList.stream().map(Movie::getName).collect(Collectors.toList());
		moviesName.forEach(System.out::println);
		
		 
	}
 
}