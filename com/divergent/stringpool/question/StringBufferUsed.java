package com.divergent.stringpool.question;

public class StringBufferUsed {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
//		sb1.append("Hello");
//		sb1.insert(0, "Hello");
//		sb1.replace(0, 5, "Hello, Java Is Simple then other but it very hard.");
//		sb1.delete(0, 3);
//		sb1.reverse();
		System.out.println(sb1.capacity());
		sb1.append("hello 01wettyy");
		System.out.println(sb1.capacity());
		sb1.append("java is my favorite subject.");
		System.out.println(sb1.capacity());
	}

}
