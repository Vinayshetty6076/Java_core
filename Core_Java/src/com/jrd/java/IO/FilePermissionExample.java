package com.jrd.java.IO;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionExample {

	public static void main(String[] args) 
	{
		String s = "link Updated.txt";
		FilePermission file = new FilePermission("link-", "read");
		PermissionCollection permission = file.newPermissionCollection();
		permission.add(file);//using add it add permission 
		
		if(permission.implies(new FilePermission(s, "read")))
		{
			System.out.println("Read permission is setted.");
		}else {
			System.out.println("Permission is not setted.");
		}
	}

}
