package com.jrd.networking;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpUrlConnectionExample {

	public static void main(String[] args) throws IOException 
	{
		URL url = new URL("https://www.javatpoint.com/");
		HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
		
		for(int i=1;i<=8;i++){  
			System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
			}  
		
		huc.disconnect();
		
	}

}
