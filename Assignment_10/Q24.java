package Assignment_10;

public class Q24 {

	public static void main(String[] args) {

		// String sentence = "We study java not phyton";
		String sentence = "What's the difference between java, javascript and python?";

		String word1 = "java";
		String word2 = "phyton";
		char c1;
		char c2;

		int position1;
		int counter1 = 0;
		int position2;
		int counter2 = 0;

		for (int i = 0; i < word1.length(); i++) {
			c1 = word1.charAt(i);

			position1 = word1.indexOf(i);
			while (counter1 != -1) {
				counter1++;
				position1 = word1.indexOf(i, position1 + 1);

			}

			for (int j = 0; j < word2.length(); j++) {
				c2 = word2.charAt(j);

				position2 = word2.indexOf(j);
				while (counter2 != -1) {
					counter2++;
					position2 = word2.indexOf(j, position2 + 1);
				}
			}
		}
		if (sentence.contains(word1) && sentence.contains(word2) && counter1 == counter2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
