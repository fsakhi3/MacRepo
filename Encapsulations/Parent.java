package com.Encapsulations;

public class Parent {

	static void hello() {
		System.out.println("Hello from Super class");
	}
}
class Child extends Parent{
	static void hello() {
		System.out.println("Hello from Sub class");
	}
}