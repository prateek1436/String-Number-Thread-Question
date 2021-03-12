package com.divergent.all.question;

public class Assert1 {

	public static void main(String[] args) {
		int value = 25;
		assert value <= 20 : " Underweight";
		System.out.println("value of value is : " + value);
		int x = 11;
		if ((x & 1) == 1) {
		} else 
		{
			assert (x % 2 == 0);
		}
	}

}
