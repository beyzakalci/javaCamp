package inheritanceHomework;

public class Instructor {

	private String InsturctorNumber;
	private String givenCourse;
	
	public Instructor() {
		
		}
	
	public Instructor(String InstructorNumber, String givenCourse) {
		
		this.InsturctorNumber = InstructorNumber;
		this.givenCourse = givenCourse;
	}
	
	
	public String getInsturctorNumber() {
		return InsturctorNumber;
	}
	public void setInsturctorNumber(String insturctorNumber) {
		InsturctorNumber = insturctorNumber;
	}
	public String getgivenCourse() {
		return givenCourse;
	}
	public void setgivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}
	
}
