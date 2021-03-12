package com.divergent.all.question;

import java.util.List;
import java.util.Arrays;

public class AslistArrayInt {

	public static void main(String[] args) {
		try {
			Integer a[] = new Integer[] {10,20,30,40,50,60};
			List<Integer> list1 =Arrays.asList(a);
			System.out.println("The list is : "+list1);
		} catch (NullPointerException e) {
			System.out.println("Exception throw : "+e);
		}

	}

}
