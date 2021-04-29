package Assignment_10;


public class Q27 {

	public static void main(String[] args) {
		
	coverString("Certified Wooden Spoon", "o");
		
	}
	public static void coverString(String firstWord, String secondWord) {
		
		if(firstWord.contains(secondWord)) {
			
			firstWord = firstWord.replace(secondWord, "[" +secondWord + "]");
			System.out.println(firstWord);
		}
	}
}
