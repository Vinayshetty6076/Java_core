package com.jrd.String.metods;

public class Methods {

	public static void main(String[] args) 
	{
		String name="Hello World";  
		char ch=name.charAt(4);//returns the char value at the 4th index  
		System.out.println(ch); 
		
		 int strLength = name.length();      
		 // Fetching first character  
		 System.out.println("Character at 0 index is: "+ name.charAt(0));      
		 // The last Character is present at the string length-1 index  
		 System.out.println("Character at last index is: "+ name.charAt(strLength-1)); 
		 
		 
		 String s1="java string";
		 System.out.println(s1.substring(2,4));//returns va  
		 System.out.println(s1.substring(2));//returns va string
		 
		 System.out.println(name.contains("about"));  
		 System.out.println(name.contains("Hello")); 
		 
		     
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		s1.concat("is immutable");    
		System.out.println(s1);    
		s1=s1.concat(" is immutable so assign it explicitly  ");    
		System.out.println(s1);   
		
		
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString);
		
		int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
		System.out.println(index3);//12 i.e. the index of another is  
		int index4=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index4);//5
		
		
		String s1lower=s1.toLowerCase();  
		System.out.println(s1lower);  
		
		
		String s1upper=s1.toUpperCase();  
		System.out.println(s1upper);  
		
		
		System.out.println(s1+"java string");//without trim()  
		System.out.println(s1.trim()+"java string");//with trim()  
		
		
		String s="";  
		String s2="jAva string";  
		  
		System.out.println(s.isEmpty());  
		System.out.println(s2.isEmpty());
		
		String s3 = "Java string";
		System.out.println(s3.toLowerCase().equals(s2.toLowerCase()));
	}

}