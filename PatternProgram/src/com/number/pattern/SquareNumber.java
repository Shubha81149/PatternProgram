package com.number.pattern;

import java.util.Scanner;

public class SquareNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			int k = 1;
			
			for (int j = 1; j <= n; j++) {
				 
				System.out.print(k+"\t");
				k++;
			}
			System.out.println();
		}
	}

}
