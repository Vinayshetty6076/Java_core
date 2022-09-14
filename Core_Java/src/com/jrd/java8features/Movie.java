package com.jrd.java8features;

public class Movie 
{
	String name;
	Integer releaseYear;
	String actor;

	
	public Movie(String name, Integer releaseYear, String actor) {
		super();
		this.name = name;
		this.releaseYear = releaseYear;
		this.actor = actor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
}
