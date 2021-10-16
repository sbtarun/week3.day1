package week3.day1.assignments;

public class StringIndex {
	public static void main(String[] args) {
		String text = "Java Exercise";
		System.out.println(text.length());
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'E' || text.charAt(i) == 's') {
				System.out.println("Index of " + text.charAt(i) + " is " + +i);
			}
		}
	}
}

//Index for character E and s
