package inheritancehw;

public class main {

	public static void main(String[] args) {
		
		Instructor EnginDemiro� = new Instructor();
		
			EnginDemiro�.InstructorName = "Engin Demiro�";
			EnginDemiro�.userName = "Engin123";
			EnginDemiro�.userNumber = "001";
			EnginDemiro�.Course = "Java + React";
		
			
		student BeyzaKalc� = new student();
		
			BeyzaKalc�.studentName = "Beyza Kalc�";
			BeyzaKalc�.userName = "Beyza123";
			BeyzaKalc�.userNumber = "002";
			BeyzaKalc�.Course = "Java + React";
			
			userManager userManager = new userManager();
			user[] users = {EnginDemiro�, BeyzaKalc�};
	
			userManager.addMultiple(users);
			
		}
	


}
