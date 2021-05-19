package inheritance;

public class Main {

	public static void main(String[] args) {

		/*Customer customer = new Customer ();
		customer.id = 1;
		customer.firstName = "Engin";
		customer.lastName = "Demiroð";
		customer.nationalIdentity = "10000000";
		customer.customerNumber = "1323";*/
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		/*CustomerManager customerManager = new CustomerManager();
		customerManager.add(hepsiBurada);
		customerManager.add(engin);*/
		
		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = {engin, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
	}

}
