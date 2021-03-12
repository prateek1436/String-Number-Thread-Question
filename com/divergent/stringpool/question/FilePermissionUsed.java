package com.divergent.stringpool.question;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionUsed {

	public static void main(String[] args) {
		String str = "D:\\IO Package\\java.txt";
		FilePermission file1 = new FilePermission("D:\\IO Package\\-", "read");
		PermissionCollection pc = file1.newPermissionCollection();
		pc.add(file1);
		FilePermission file2 = new FilePermission(str, "write");
		pc.add(file2);
		if(pc.implies(new FilePermission(str, "read,write"))) {
			System.out.println("Read, Write permission granded"+str);
		}else {
			System.out.println("No read,write permission granded"+str);
		}
	}

}
