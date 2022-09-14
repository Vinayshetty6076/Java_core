package com.jrd.java.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamExample {

	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fout = new FileOutputStream("C:\\Users\\nithin.saji\\Desktop\\Demo1.txt");
		DataOutputStream dout = new DataOutputStream(fout);
		dout.write(123456789);
		dout.writeInt(123456789);
		dout.writeBoolean(false);
		dout.writeByte(638331218);
		dout.writeBytes("Hello");
		dout.close();
	}

}