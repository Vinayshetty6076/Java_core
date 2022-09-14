package com.jrd.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {

	public static void main(String[] args) 
	{
		List<Movie> movielist = new ArrayList<Movie>();
		
		Movie movie1 = new Movie("Master",2021,"Vijay");
		
		Movie movie2 = new Movie("Viswasam",2019,"Ajith");
		
		movielist.add(movie1);
		movielist.add(movie2);
		
//		findMovieIn2019(movielist);
//		findMovieByActor(movielist);
		
		getMovie(movielist, m -> m.getReleaseYear()==2019);
		
		getMovie(movielist, m -> m.getActor().equalsIgnoreCase("Vijay"));
	}

//	private static void findMovieByActor(List<Movie> movielist) 
//	{
//		for(Movie movie:movielist)
//		{
//			if(movie.getActor().equalsIgnoreCase("Vijay"))
//			{
//				System.out.println(movie.getName());
//			}
//		}
//	}
//
//	private static void findMovieIn2019(List<Movie> movielist) 
//	{
//		for(Movie movie:movielist)
//		{
//			if(movie.getReleaseYear()==2019)
//			{
//				System.out.println(movie.getName());
//			}
//		}
//		
//	}
	
	private static void getMovie(List<Movie> movielist,Predicate<Movie> moviePredicate) 
	{
		for(Movie movie:movielist)
		{
			if(moviePredicate.test(movie))
			{
				System.out.println(movie.getName());
			}
		}
	}

}