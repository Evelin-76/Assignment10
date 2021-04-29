package Assignment_10;

public class Q30 {

	public static void main(String[] args) {
		
		at3("blabla", "a");

	}
	public static void at3(String word, String insert) {
		
		word = word.subSequence(0, 3)+ insert + word.substring(3);
		System.out.println(word);
	}
}
