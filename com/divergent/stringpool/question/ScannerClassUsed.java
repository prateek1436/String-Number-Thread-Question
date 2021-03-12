package com.divergent.stringpool.question;

import java.util.Scanner;

public class ScannerClassUsed {

	public static void main(String[] args) {
		int n1,n2,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Number");
		n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter a Second Number");
		n2 = Integer.parseInt(sc.nextLine());
		result = n1 * n2;
		System.out.println("Result is :"+result);
	}

}
