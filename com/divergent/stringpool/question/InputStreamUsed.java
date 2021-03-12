package com.divergent.stringpool.question;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamUsed {

	public static void main(String[] args) {
		try {
			InputStream stream = new FileInputStream("D:\\IO Package\\java.txt");
			Reader reader = new InputStreamReader(stream);
			int data = reader.read();
			while(data!=-1) {
				System.out.print((char)data);
				data = reader.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
