package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

//loosly - tightly coupled

	public void add(Customer customer) {

		System.out.println("M��teri eklendi " + customer.getFirstName());
		// DatabaseLogger logger = new DatabaseLogger();
		// logger.log(customer.getFirstName() + "Veritaban�na logland�.");

		// this.logger.log(customer.getFirstName());

	/*	for (Logger logger : loggers) {

			logger.log(customer.getFirstName());

		}*/
		
	//	Utils utils = new Utils(); //utils de static yazd���m�z i�in sildik.
		Utils.runLoggers(loggers, customer.getFirstName());

	}

	public void delete(Customer customer) {

		System.out.println("M��teri silindi " + customer.getFirstName());
		// DatabaseLogger logger = new DatabaseLogger();
		// logger.log(customer.getFirstName() + "Veritaban�na logland�.");

	/*	for (Logger logger : loggers) {

			logger.log(customer.getFirstName()); */
		
		Utils.runLoggers(loggers, customer.getLastName());

		}

	}


