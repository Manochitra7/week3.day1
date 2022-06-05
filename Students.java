package javaAssignment;

public class Students {
	// method Overloading
	public void getStudentDetails(int id) {
		System.out.println("Id=" +id);
	}
	public void getStudentDetails(int id,String name) {
		System.out.println("Student Id is"+ id);
		System.out.println("Student Name : "+  name);
	}
    public void getStudentDetails(String email, long PhoneNumber) {
    	System.out.println("email id ="+ email);
    	System.out.println("PhoneNumber="+ PhoneNumber);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stu= new Students();
		stu.getStudentDetails(101);
		stu.getStudentDetails(105, "vino");
         stu.getStudentDetails("vvv@gmail.com", 9000000000000L);   
	}

}
