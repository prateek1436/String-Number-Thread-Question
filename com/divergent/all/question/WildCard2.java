package com.divergent.all.question;

import java.util.Arrays;
import java.util.List;

public class WildCard2 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4,5,6,7);
		printClass(list1);
		List<Number> list2 = Arrays.asList(4,5,6);
		printClass(list2);
	}
	public static void printClass(List<? super Integer>list) {
		System.out.println(list);
	}

}
