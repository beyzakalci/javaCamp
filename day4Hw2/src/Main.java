import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new NeroCustomerManager();
		
		Customer customer = new Customer();
		
		customer.setId(1);
		customer.setFirstName("Beyza");
		customer.setLastName("Kalcý");
		customer.setDateOfBirth(9/7/2000);
		customer.setNationalityID("12345678910");
		
		customerManager.add(customer);
		
	}

}
