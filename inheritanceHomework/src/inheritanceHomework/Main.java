package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		user user = new user();
		user.setId(1);
		user.setUserName("Beyza_Kalcı");
		
		student student = new student();
		
		student.setStudentNumber("001");
		student.settakenCourse("Java + React");
		
		Instructor instructor = new Instructor();
		
		instructor.setInsturctorNumber("101");
		instructor.setgivenCourse("Java + React");
		
		
		System.out.println(user.getId());
		System.out.println(user.getUserName());
		System.out.println(student.getStudentNumber());
		System.out.println(student.gettakenCourse());
		System.out.println(instructor.getInsturctorNumber());
		System.out.println(instructor.getgivenCourse());
		
	
	}

}
