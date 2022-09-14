package com.jrd.networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramReceiver 
{
	public static void main(String[] args) throws Exception 
	{
		DatagramSocket ds = new DatagramSocket(5000);
		
		byte[] buf = new byte[1024];
		
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		
		ds.receive(dp);
		
		String str = new String(dp.getData(), 0, dp.getLength());
		
		System.out.println(str);
		
		ds.close();
	}
}
