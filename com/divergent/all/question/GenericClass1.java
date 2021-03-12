package com.divergent.all.question;

//public class GenericClass1 {
//
//	//Java Generic Method
//	public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
//		return g1.get().equals(g2.get());
//	}
//	
//	public static void main(String args[]){
//		GenericsType<String> g1 = new GenericsType<>();
//		g1.set("Pankaj");
//		
//		GenericsType<String> g2 = new GenericsType<>();
//		g2.set("Pankaj");
//		
//		boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
//		//above statement can be written simply as
//		isEqual = GenericsMethods.isEqual(g1, g2);
//		//This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
//		//Compiler will infer the type that is needed
//	}
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericClass1 {

	public static void main(String[] args) {
//		List<Integer> ints = new ArrayList<>();
//		ints.add(3); ints.add(5); ints.add(10);
		List<Integer> list  = Arrays.asList(1,2,3,4);
		double sum = sum(list);
		System.out.println("Sum of ints="+sum);
		sum1(list);
	}

	public static double sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}

public static void sum1(List<? super Integer> list){
		System.out.println(list);
	}
}