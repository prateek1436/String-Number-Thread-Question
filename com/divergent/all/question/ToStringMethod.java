package com.divergent.all.question;

class ToStringMethod {
	int rollno;
	String name;
	String city;

	ToStringMethod(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public String toString() {// overriding the toString() method
		return rollno + " " + name + " " + city;
	}

	public static void main(String args[]) {
		ToStringMethod s1 = new ToStringMethod(101, "Raj", "lucknow");
		ToStringMethod s2 = new ToStringMethod(102, "Vijay", "ghaziabad");

		System.out.println(s1);
		System.out.println(s2);
//  s1.toString(); 
//  s2.toString();
	}
}
