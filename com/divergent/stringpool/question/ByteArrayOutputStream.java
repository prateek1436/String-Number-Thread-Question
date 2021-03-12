package com.divergent.stringpool.question;

import java.io.ByteArrayInputStream;

public class ByteArrayOutputStream {

	public static void main(String[] args) {
		byte buf[] = {35,36,37,38};
		ByteArrayInputStream btn = new ByteArrayInputStream(buf);
		int k = 0;
		while((k=btn.read())!= -1) {
			char ch = (char)k;
			System.out.println("ASCII of"+k+" Special character "+ch);
		}
	}

}
