package com.divergent.all.question;

class Person<T>{
	T id;
	T name;
	T surname;
	public void  setData(T id,T name, T Surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	public void getData(T id,T name,T Surname) {
		System.out.println(id+ " "+name+ " "+surname);
	}
	
}
class Student<S> extends Person{
	public void getData() {
		System.out.println("Students Class");
	}
}
public class GenricInheritance {

	public static void main(String[] args) {
		Student stud = new Student();
		Person stud1 = new Person();
//		Student stud2 = new Person();
		stud.getData();
		stud1.getData(101, "Prateek", "Patel");
//		stud2.getData(101, "Prateek", "Patel");
	}

}
