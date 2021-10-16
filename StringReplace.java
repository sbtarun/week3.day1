package week3.day1.assignments;

public class StringReplace {

	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		System.out.println("Original sentence is: " + sentence);
		System.out.println("Replaced sentence is: " + sentence.replaceFirst("8", "11#"));
		System.out.println("Sentence from index 5-14 is: " + sentence.substring(5, 14));
	}
}
