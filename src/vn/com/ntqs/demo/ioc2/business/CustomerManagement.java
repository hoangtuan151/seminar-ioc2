package vn.com.ntqs.demo.ioc2.business;

import vn.com.ntqs.demo.ioc2.application.ConsoleLogger;

public class CustomerManagement {

	private ConsoleLogger logger;
	
	public CustomerManagement(ConsoleLogger logger) {
		this.logger = logger;
	}
	
	public void registerUser(String username, String passwd) {
		// do some register logic...
		
		// log the result
		logger.log("Success register user: " + username);
	}
}
