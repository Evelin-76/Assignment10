package Assignment_10;

public class Q29 {

	public static void main(String[] args) {
		
		limit("bla bla bal", 3);

	}
	public static void limit(String word, int userLimit) {
		
		word = word.substring(0, userLimit);
		System.out.println(word);
		
	}
}
