package com.jrd.networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception 
	{

			Socket s = new Socket("localhost",6666);
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str="" ,str2="";
			
			while(!str.equals("stop"))
			{
				str = br.readLine();
				dos.writeUTF(str);
				dos.flush();
				str2 = dis.readUTF();
				System.out.println("Server : "+str2);
			}
			dos.close();
			s.close();
	}

}
