package week3.day1.assignments;

public class AxisBank extends BankInfo {

	public void fixed() {
		System.out.println("Overriden method of Fixed is called");
	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}

}
