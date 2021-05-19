package Abstract;

import Entities.Customer;

public interface CustomerCheckService {

	static boolean CheckIfRealPerson(Customer customer) {
		return false;
	}
}
