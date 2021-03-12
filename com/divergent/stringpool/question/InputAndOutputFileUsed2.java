package com.divergent.stringpool.question;

import java.io.FileInputStream;
import java.io.IOException;

public class InputAndOutputFileUsed2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\sl\\\\Desktop\\\\DailyTask.txt");
			int i = fis.read();
			System.out.println((char)i);
			fis.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
