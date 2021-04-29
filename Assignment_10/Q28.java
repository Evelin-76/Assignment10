package Assignment_10;

public class Q28 {

	public static void main(String[] args) {
		
		clean("one two three", "two");

	}
	public static void clean(String tex, String badWord) {
		
		if(tex.contains(badWord)) {
			tex = tex.replace(badWord, "");
			tex = tex.trim();
			System.out.println(tex);
		}
	}
}
