package com.jrd.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IOEnhancements {

	public static void main(String[] args) 
	{
		Stream<Path> list = null;
		try {
			list = Files.list(Paths.get("."));//. means current directory
			list.forEach(System.out::println);
			
			Files.list(Paths.get("C:\\Users\\nithin.saji\\Desktop\\Core Java")).filter(Files::isRegularFile).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}