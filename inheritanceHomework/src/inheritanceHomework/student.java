package inheritanceHomework;

public class student {
	
	private String studentNumber;
	private String takenCourse;
	
	public student () {
		
		
	}
	
	public student (String studentNumber, String takenCourse) { 
		
		this.studentNumber = studentNumber;
		this.takenCourse = takenCourse;
		
		
	}
	
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String gettakenCourse() {
		return takenCourse;
	}
	public void settakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	}


}
