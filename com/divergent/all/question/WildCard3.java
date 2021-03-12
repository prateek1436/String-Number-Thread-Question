package com.divergent.all.question;

import java.util.Arrays;
import java.util.List;

public class WildCard3 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Double> list2 = Arrays.asList(1.1,2.2,3.3);
		printList(list1);
		printList(list2);
	}
	public static void printList(List<?>list) {
		System.out.println(list);
	}

}
