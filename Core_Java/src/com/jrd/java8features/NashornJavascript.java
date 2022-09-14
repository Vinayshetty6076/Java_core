package com.jrd.java8features;

import java.io.FileReader;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornJavascript {

	public static void main(String[] args) throws Exception 
	{
		ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");
		
		se.eval(new FileReader("C:\\Users\\nithin.saji\\Desktop\\Nithin\\Demo.js"));
	}

}
