package week3.day1.assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("ID number is " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("ID number is " + id + " and name is " + name);
	}

	public void getStudentInfo(String email, String phno) {
		System.out.println("Email ID is " + email + " and phone number is " + phno);

	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(50);
		obj.getStudentInfo(50, "Tarun");
		obj.getStudentInfo("tarun@gmail.com", "1234567890");
	}

}
