package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		Customer[] cArray = new Customer[2];
		Employee[] eArray = new Employee[1];
		
		Customer c01 = new Customer("jws", "j1234", "정우성", 1000);
		Customer c02 = new Customer("lhr", "l1234", "이효리", 2000);
		Employee e01 = new Employee("master", "m7788", "운영자", 500);
		
		
		cArray[0] = c01;
		cArray[1] = c02;
		eArray[0] = e01;
		
		for(int i = 0; i<cArray.length; i++) {
			System.out.println(cArray[i].toString());
		}
		for(int i = 0; i<eArray.length; i++) {
			System.out.println(eArray[i].toString());
		}
		
	}

}
