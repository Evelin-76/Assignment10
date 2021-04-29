package Assignment_10;

public class Q19 {

	public static void main(String[] args) {

		// Return the number of times that the string "java appears anywhere in the
		// given string word

		String fullWord = "javaxjavadsjlfjavalñas";
		String word = "java";
		
		for (int i = 0; i < word.length(); i++) {
	
			int position = 0;
			int counter = 0;

			position = fullWord.indexOf("java");

			while (position != -1) {
				counter++;
				position = fullWord.indexOf("java", position + 1);
			}
			System.out.println("Prase: " + fullWord);
			System.out.println("\"java\" appears " + counter + "times");
			break;
		}

	}

}
