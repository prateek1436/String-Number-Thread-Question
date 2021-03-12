package com.divergent.stringpool.question;

import java.io.FileOutputStream;
import java.io.IOException;

public class InputAndOutputFileUsed1 {

	public static void main(String[] args) {
//		int i;
//		try {
//			i = System.in.read();
//			System.out.println((char)i);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try{    
            FileOutputStream fout=new FileOutputStream("C:\\Users\\sl\\Desktop\\DailyTask.txt"); 
            String s = "Welcome to javaTpoint";
            byte b[] = s.getBytes();
            fout.write(b);    
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);} 
		
	}

}
