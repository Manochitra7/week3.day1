package javaAssignment;

public class AxisBank extends BankInfo {
// Over riding of method
	public void deposit() {
		System.out.println("Axis Bank Deposit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank action= new AxisBank();
		action.deposit();
		action.fixed();
		action.savings();
		

	}

}
