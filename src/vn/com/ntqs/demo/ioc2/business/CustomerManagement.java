package vn.com.ntqs.demo.ioc2.business;

import vn.com.ntqs.demo.ioc2.application.ConsoleLogger;

public class CustomerManagement {

	private ConsoleLogger logger;
	
	public CustomerManagement() {
		this.logger = new ConsoleLogger();
		this.logger.setColorful(true);
	}
	
	public void registerUser(String username, String passwd) {
		// do some register logic...
		
		// log the result
		logger.log("Success register user: " + username);
	}
}
