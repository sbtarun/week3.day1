package week3.day1.assignments;

public class StringText {
	public static void main(String[] args) {
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");
		if (str3 == str4) {
			System.out.println("Same text");
		} else
			System.out.println("Diff text");

		System.out.println("***");
	}
}

/*
 * We are using the operator "==" for comparing the String Objects and not the
 * contents of the objects. Here, both the objects are different and hence the
 * outcome of this comparison is “False”
 */
