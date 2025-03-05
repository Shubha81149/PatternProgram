package com.character.pattern;

import java.util.Scanner;

public class SquareCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			char k = 'A';
			
			for (int j = 1; j <= n; j++) {
				 
				System.out.print(k+"\t");
				k++;
			}
			System.out.println();
		}
	}

}
