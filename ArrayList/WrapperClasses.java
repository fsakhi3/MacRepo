package com.ArrayList;

public class WrapperClasses {

	
	public static void main(String[] args) {
		
		int num=10;
		
		//Autoboxing --> converting primitive type into an Object type
		Integer integer=100000;
		System.out.println(integer.MIN_VALUE);
		String str=integer.toString();
		System.out.println(str);
		//converting boolean primitve type into Boolean Object type
		Boolean bool=true;
		Byte $b=20;
		System.out.println($b.MAX_VALUE);
		
		//AutoUnboxing --> converting Object type into a primitive type
		int num1=new Integer(10);
		System.out.println(num1);
		
	}
}
