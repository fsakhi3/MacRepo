package com.NestedLoop;

public class NestedLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			
			System.out.println("I am outer loop");

			for (int j = 1; j <= 4; j++) {

				System.out.println("I am inner loop");

			}
		}
	}
}
