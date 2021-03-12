package com.divergent.stringpool.question;

//strictfp 
class CalculationStrictfpUsed{
	double num1 = 10e+102;
	double num2 = 6e+08;
	double calculation() {
		return num1 + num2;
	}
}
public class StrictfpUsed {

	public static void main(String[] args) {
		CalculationStrictfpUsed sp = new CalculationStrictfpUsed();
		System.out.println(sp.calculation());
	}

}
