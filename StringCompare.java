package week3.day1.assignments;

public class StringCompare {

	public static void main(String[] args) {
		String str1 = "I am Learning Java";
		String str2 = "I am learning java";
		System.out.println("Using == Operator the result is: " + (str1 == str2));
		System.out.println("Using equals method the result is: " + str1.equals(str2));
		System.out.println("Using equalsignorecase method the result is: " + str1.equalsIgnoreCase(str2));
	}
}
