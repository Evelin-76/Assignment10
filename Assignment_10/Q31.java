package Assignment_10;

public class Q31 {

	public static void main(String[] args) {
		
		isPalindrome("Nurses Run");
		
	}
	public static void isPalindrome(String phrase) {
		
		phrase = phrase.replace(" ", "");
		String reversePhrase = "";
		
		for(int i = phrase.length()-1; i >= 0; i--) {
		
			reversePhrase = reversePhrase + phrase.charAt(i);
			}
			//System.out.println(reversePhrase);
			if(phrase.equalsIgnoreCase(reversePhrase)) {
				System.out.println("Is palindrome(" + phrase + ")==>"+ true);
			}else {
				System.out.println("Is palindrome(" + phrase + ")==>"+ false);
			}
	}
}
