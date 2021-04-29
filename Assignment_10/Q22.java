package Assignment_10;


public class Q22 {

	public static void main(String[] args) {
		
		attribute("<!DOCTYPE html><html><head><title>Java</title></head><body><p"
				+ "id=\"myid\"></p></body></html>");

	}
	public static void attribute(String html) {
		
		String tag = "myid";
		if(html.contains(tag)) {
			System.out.println(tag);
		}else {
			System.out.println("Invalid input!");
		}
		
		
	}
}
