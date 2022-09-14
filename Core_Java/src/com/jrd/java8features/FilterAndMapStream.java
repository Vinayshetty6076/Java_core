package com.jrd.java8features;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Stream;

public class FilterAndMapStream {

	public static void main(String[] args) 
	{
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("M2",2021,"A2"));
		movieList.add(new Movie("M1",2020,"A1"));
		movieList.add(new Movie("Master",2021,"Vijay"));
		movieList.add(new Movie("Viswasam",2019,"Ajith"));
		movieList.add(new Movie("Master",2020,"Vijay"));
		movieList.add(new Movie("Viswasam",2020,"Ajith"));
		
		
		
		Stream<Movie> movieStream = movieList.stream();
		//Using filter
		Stream<Movie> movieFilter = movieStream.filter(m -> m.getReleaseYear()<=2020);//here checking some condition so we can't sort lambda into method reference
		
		//Using Map
		//Stream<String> movieName = movieFilter.map(m -> m.getName());
		Stream<String> movieName = movieFilter.map(Movie::getName);
		movieName.forEach(System.out::println);
		
		//Shortest method
		movieList.stream() 								//source
				.filter(m -> m.getReleaseYear()<=2020)	//intermediate
				.map(Movie::getName)					//intermediate
				.forEach(System.out::println);			//Terminal
		
		Stream<Integer> st = Stream.iterate(1, element->element+1);
        st.filter(element->element%5==0)  
        .limit(5)
        .forEach(System.out::println); 
	}

}
