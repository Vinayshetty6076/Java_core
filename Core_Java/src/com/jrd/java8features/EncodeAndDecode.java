package com.jrd.java8features;

import java.util.Base64;

public class EncodeAndDecode {

	public static void main(String[] args) 
	{
		String user = "Username";
		String pass = "123456789";
		
		Base64.Encoder encode = Base64.getEncoder();
		String en = encode.encodeToString((user+":"+pass).getBytes());
		System.out.println(en);
		
		Base64.Decoder decode = Base64.getDecoder();
		byte[] de =  decode.decode("VXNlcm5hbWU6MTIzNDU2Nzg5");
		System.out.println(new String(de));
	}

}
