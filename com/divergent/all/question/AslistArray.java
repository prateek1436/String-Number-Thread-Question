package com.divergent.all.question;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AslistArray {

	public static void main(String[] args) {
	try {
		String a[] = new String[] {"A","B","C","D"};
		java.util.List<String> list = Arrays.asList(a);
		System.out.println("The list is : "+ list);
	} catch (NullPointerException e) {
		System.out.println("Exception Throw: "+e);
	}
	}

}
