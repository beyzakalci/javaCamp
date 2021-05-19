package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

//loosly - tightly coupled

	public void add(Customer customer) {

		System.out.println("Müþteri eklendi " + customer.getFirstName());
		// DatabaseLogger logger = new DatabaseLogger();
		// logger.log(customer.getFirstName() + "Veritabanýna loglandý.");

		// this.logger.log(customer.getFirstName());

	/*	for (Logger logger : loggers) {

			logger.log(customer.getFirstName());

		}*/
		
	//	Utils utils = new Utils(); //utils de static yazdýðýmýz için sildik.
		Utils.runLoggers(loggers, customer.getFirstName());

	}

	public void delete(Customer customer) {

		System.out.println("Müþteri silindi " + customer.getFirstName());
		// DatabaseLogger logger = new DatabaseLogger();
		// logger.log(customer.getFirstName() + "Veritabanýna loglandý.");

	/*	for (Logger logger : loggers) {

			logger.log(customer.getFirstName()); */
		
		Utils.runLoggers(loggers, customer.getLastName());

		}

	}


