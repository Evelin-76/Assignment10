package Assignment_10;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {

		
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		
		for (int i = 0; i < alphabet.length; i++) {
		}
		Scanner scn = new Scanner(System.in);

		char first;
		char second;
		
		System.out.println("Enter your first letter:");
		first = scn.next().charAt(0);
		System.out.println("Enter your second letter:");
		second = scn.next().charAt(0);

		for (int i = first; i < second + 1; i++) {

			System.out.print((char) i);
		}

	}

}
