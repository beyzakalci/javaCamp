package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {
	
	public void add(Customer customer) {
		
		System.out.println("Sisteme kaydedildi: " + customer.getFirstName() + " " + customer.getLastName());
		
	}

}
