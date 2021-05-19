package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) {
		
		
		System.out.println(customer.customerNumber + " kaydedildi.");
		

	/* classlar onu extend eden s�n�flar�n referanslar�n� tutabilir.
	 
	 	public void add(CorporateCustomer customer) {
		
		System.out.println(customer.customerNumber + "kaydedildi.");

		
	}*/
	}
	
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer : customers) {
			
			add(customer);
				}
		
		}
	
	}
	




