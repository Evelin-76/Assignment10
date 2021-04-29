package Assignment_10;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		
		String word, separator;
		int counter;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		word = scn.nextLine(); 
		System.out.println("Enter a separator: ");
		separator = scn.nextLine();
		System.out.println("Enter a counter: ");
		counter = scn.nextInt();
		
		for(int i = 0; i < counter; i++) {
			
			System.out.print(word);
			if(i == counter-1) {
				break;
			}
			for(int j = 0; j < counter; j++) {
				System.out.print(separator);
				break;
			}

		}
		
		System.out.println();

	}

}
