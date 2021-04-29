package Assignment_10;



public class Q16 {

	public static void main(String[] args) {
		
		String originalStr = "javapython";
		String word = "java";
		
		for(int i = 0; i < word.length(); i++)
			
			if(originalStr.contains(word)) {
				if(originalStr.substring(0, 4).contains(word)
						|| originalStr.substring(1,5).contains(word)) {
					System.out.println(true);
					break;
				} else {
					System.out.println(false);
					break;
				}
			}
			
	}
}
