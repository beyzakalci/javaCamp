package inheritancehw;

public class main {

	public static void main(String[] args) {
		
		Instructor EnginDemiroð = new Instructor();
		
			EnginDemiroð.InstructorName = "Engin Demiroð";
			EnginDemiroð.userName = "Engin123";
			EnginDemiroð.userNumber = "001";
			EnginDemiroð.Course = "Java + React";
		
			
		student BeyzaKalcý = new student();
		
			BeyzaKalcý.studentName = "Beyza Kalcý";
			BeyzaKalcý.userName = "Beyza123";
			BeyzaKalcý.userNumber = "002";
			BeyzaKalcý.Course = "Java + React";
			
			userManager userManager = new userManager();
			user[] users = {EnginDemiroð, BeyzaKalcý};
	
			userManager.addMultiple(users);
			
		}
	


}
