package basic;

import java.util.Scanner;

public class OneLineStar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {

			System.out.print("* ");
		}

	}

}
