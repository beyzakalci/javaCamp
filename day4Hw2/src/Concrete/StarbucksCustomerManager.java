package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
		
	}
	
	public void add(Customer customer) {
		
		if(CustomerCheckService.CheckIfRealPerson(customer)) {
			
			super.add(customer);
			
		}
		else {
			
			System.out.println("Geçerli deðil!");
		}
	}

}
