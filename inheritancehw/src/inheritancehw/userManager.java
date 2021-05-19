package inheritancehw;

public class userManager {
 
		public void add(user user) {
			
			System.out.println( "Sayın " + user.userName + " " + user.userNumber + " numarası ile sisteme kaydedildiniz.");

			}
		
		
		public void addMultiple(user[] users) {
			
			for(user user : users) {
				
				add(user);
			}
		}
}
