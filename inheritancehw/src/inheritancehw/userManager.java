package inheritancehw;

public class userManager {
 
		public void add(user user) {
			
			System.out.println( "Say�n " + user.userName + " " + user.userNumber + " numaras� ile sisteme kaydedildiniz.");

			}
		
		
		public void addMultiple(user[] users) {
			
			for(user user : users) {
				
				add(user);
			}
		}
}
