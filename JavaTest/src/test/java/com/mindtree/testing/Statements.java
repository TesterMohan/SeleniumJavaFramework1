package com.mindtree.testing;

import java.util.Scanner;

public class Statements {

	public static void main(String[] args) {
		
		//int temp = 10;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Today's temprature: ");
		int temp = scanner.nextInt();
		if (temp > 30) {
			System.out.println("It is a hot day! \nDrink plenty of water.");
		}
		else if (temp > 20) {
			System.out.println("Beautiful Day");
		}
		else {
			System.out.println("Cold day");
		}

	}

}
